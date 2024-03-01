import java.util.ArrayList;

/**
 * The Restaurant viewer class containes a program which displays restaurant
 * information to the user.
 */
public class RestaurantViewer
{
   /**
    * The main method is the program starting point.
    * @param args command line arguments
    */
   public static void main(String[] args)
   {
      final String POSTCODE = "EC4M7RF";
      RestaurantDataFetcher restaurantDataFetcherataFetcher = new RestaurantDataFetcher();
      ArrayList<Restaurant> restaurants = restaurantDataFetcherataFetcher.fetchRestaurants(POSTCODE);
      RestaurantViewer restaurantViewer = new RestaurantViewer();
      restaurantViewer.displayRestaurants(restaurants);
   }

   /**
    * Displays restaurant information.
    * @param restaurants the restaurants to display
    */
   public void displayRestaurants(ArrayList<Restaurant> restaurants)
   {
      // TODO: fill implementation
   }
}