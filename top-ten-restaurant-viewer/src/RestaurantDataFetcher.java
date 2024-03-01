import org.json.JSONArray;
import org.json.JSONObject;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

/**
 * A restaurant fetcher gets restaurant data from the JustEat Takeaway.com API.
 */
public class RestaurantDataFetcher
{
   // instance variables

   // constructors
   /**
    * Constructs a restaurant fetcher object by initialising its variables.
    */
   public RestaurantDataFetcher()
   {
   }

   // methods
   /**
    * Fetches the restaurant data of restaurants at the specified postcode,
    * and returns an array list of restaurant objects.
    * @param postcode the postcode to search for restaurant data
    * @param numberOfRestaurantsToFetch the number of restaurants to fetch
    * @return an array list of restaurant objects
    */
   public ArrayList<Restaurant> fetchRestaurants(String postcode, int numberOfRestaurantsToFetch)
   {
      ArrayList<Restaurant> restaurantsList = new ArrayList<>();

      // make HTTP GET request to the Just Eat API endpoint using the HttpClient, Request, and Response classes
      String url = "https://uk.api.just-eat.io/discovery/uk/restaurants/enriched/bypostcode/" + postcode;
      try
      {
         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder()
               .uri(URI.create(url))
               .build();
         HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

         // parse the JSON object response from the Just Eat API endpoint using the org.json library
         JSONObject jsonResponse = new JSONObject(response.body());
         JSONArray restaurantsArray = jsonResponse.getJSONArray("restaurants");

         // create a list of restaurant objects
         for (int index = 0; index < Math.min(numberOfRestaurantsToFetch, restaurantsArray.length()); index++)
         {
            JSONObject restaurantJson = restaurantsArray.getJSONObject(index);
            String name = restaurantJson.getString("name");
            String address = restaurantJson.getJSONObject("address").getString("firstLine")
                  + ", " + restaurantJson.getJSONObject("address").getString("postalCode");
            double rating = restaurantJson.getJSONObject("rating").getDouble("starRating");

            JSONArray cuisinesArray = restaurantJson.getJSONArray("cuisines");
            StringBuilder cuisinesBuilder = new StringBuilder();
            for (int position = 0; position < cuisinesArray.length(); position++)
            {
               // Get the JSONObject for the current cuisine
               JSONObject cuisine = cuisinesArray.getJSONObject(position);
               // Extract the "name" field from the cuisine object
               String cuisineName = cuisine.getString("name");
               // Append the cuisine name to the StringBuilder
               cuisinesBuilder.append(cuisineName);
               // If this is not the last item, append a comma and space
               if (position < cuisinesArray.length() - 1)
               {
                  cuisinesBuilder.append(", ");
               }
            }

            restaurantsList.add(new Restaurant(name, cuisinesBuilder.toString(), rating, address));
         }
      }
      catch (Exception e)
      {
         throw new RuntimeException(e);
      }

      return restaurantsList;
   }
}
