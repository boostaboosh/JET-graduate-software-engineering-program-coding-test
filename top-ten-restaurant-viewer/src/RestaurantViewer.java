import java.util.ArrayList;

/**
 * The Restaurant viewer class contains a program which displays restaurant
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
      final String POSTCODE = "FK94LJ"; // e.g.EC4M7RF
      RestaurantDataFetcher restaurantDataFetcher = new RestaurantDataFetcher();
      ArrayList<Restaurant> restaurants = restaurantDataFetcher.fetchRestaurants(POSTCODE, 10);
      RestaurantViewer restaurantViewer = new RestaurantViewer();
      restaurantViewer.displayRestaurants(restaurants);
   }

   /**
    * Displays restaurant information.
    * @param restaurants the restaurants to display
    */
   public void displayRestaurants(ArrayList<Restaurant> restaurants)
   {
      if (restaurants.isEmpty())
      {
         System.out.println("No restaurants found.");
      }
      else
      {
         int counter = 1;
         for (Restaurant restaurant : restaurants)
         {
            System.out.println("Restaurant number: " + counter);
            System.out.println("Name: " + restaurant.getName());
            System.out.println("Cuisines: " + restaurant.getCuisines());
            System.out.println("Rating: " + restaurant.getNumberRating());
            System.out.println("Address: " + restaurant.getAddress());
            System.out.println();
            counter = counter + 1;
         }
      }
   }
}
