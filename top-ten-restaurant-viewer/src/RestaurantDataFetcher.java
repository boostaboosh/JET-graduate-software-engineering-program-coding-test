import java.util.ArrayList;

/**
 * A restaurant fetcher gets restaurant data from the JustEat Takeaway.com API.
 */
public class RestaurantDataFetcher
{
   // instance variables
   private int numberOfRestaurantsToFetch;

   // constructors
   /**
    * Constructs a restaurant fetcher object by initialising its variables.
    */
   public RestaurantDataFetcher(int numberOfRestaurantsToFetch)
   {
      this.numberOfRestaurantsToFetch = numberOfRestaurantsToFetch;
   }

   // methods
   /**
    * Sets the number of restaurants to fetch.
    * @param numberOfRestaurantsToFetch the number of restaurants to fetch
    */
   public void setNumberOfRestaurantsToFetch(int numberOfRestaurantsToFetch)
   {
      this.numberOfRestaurantsToFetch = numberOfRestaurantsToFetch;
   }

   /**
    * Fetches the restaurant data of restaurants at the specified postcode,
    * and returns an array list of restaurant objects.
    * @param postcode the postcode to search for restaurant data
    * @return an array list of restaurant objects
    */
   public ArrayList<Restaurant> fetchRestaurants(String postcode)
   {
      // TODO: fill implementation
      return new ArrayList<>();
   }
}
