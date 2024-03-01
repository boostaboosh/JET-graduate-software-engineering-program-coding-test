import java.util.ArrayList;
import java.util.Comparator;

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
      RestaurantDataFetcher restaurantDataFetcher = new RestaurantDataFetcher();
      final String POSTCODE = "CT179FL"; // e.g.EC4M7RF
      ArrayList<Restaurant> restaurants = restaurantDataFetcher.fetchRestaurants(POSTCODE);

      RestaurantViewer restaurantViewer = new RestaurantViewer();
      final int NUMBER_OF_RESTAURANTS_TO_DISPLAY = 10;
      ArrayList<Restaurant> topTenRestaurants =
            restaurantViewer.getTopRestaurants(restaurants, NUMBER_OF_RESTAURANTS_TO_DISPLAY);
      restaurantViewer.displayRestaurants(topTenRestaurants);
   }

   /**
    * Returns the restaurants with the highest rating in the array list.
    * @param restaurants the array list of restaurants to search within
    * @param numberOfRestaurantsToDisplay the number of restaurants to return
    * @return an array list with the specified number of highest rated restaurants
    */
   private ArrayList<Restaurant> getTopRestaurants(ArrayList<Restaurant> restaurants, int numberOfRestaurantsToDisplay)
   {
      ArrayList<Restaurant> topTenRestaurants = new ArrayList<>();

      restaurants.sort(new Comparator<Restaurant>()
      {
         @Override
         public int compare(Restaurant restaurantOne, Restaurant restaurantTwo)
         {
            final double EPSILON = 1E-14;
            if (Math.abs(restaurantOne.getNumberRating() - restaurantTwo.getNumberRating()) < EPSILON)
            {
               return 0;
            }
            else if (restaurantOne.getNumberRating() < restaurantTwo.getNumberRating())
            {
               // defining a descending order sort by telling the sort method that restaurantOne
               // should come after restaurantTwo if restaurantOne has a lower rating
               return 1;
            }
            else
            {
               return -1;
            }
         }
      });

      if (restaurants.size() <= numberOfRestaurantsToDisplay)
      {
         topTenRestaurants = restaurants;
      }
      else
      {
         for (int index = 0; index < numberOfRestaurantsToDisplay; index++)
         {
            topTenRestaurants.add(restaurants.get(index));
         }
      }

      return topTenRestaurants;
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
