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
      // TODO: fill implementation
      // make HTTP GET request to the Just Eat API endpoint
      // parse the JSON object response from the Just Eat API endpoint
      // create a list of restaurants of numberOfRestaurantsToFetch length
      return new ArrayList<>();
   }
}
