/**
 * A restaurant object has the data-points:
 * name, cuisines, number-rating, address.
 */
public class Restaurant
{
   // instance variables
   private final String name;
   private final String cuisines;
   private final double numberRating;
   private final String address;

   // constructors
   /**
    * Constructs a restaurant object.
    * @param name the name of the restaurant
    * @param cuisines the cuisines offered by the restaurant
    * @param numberRating the customer rating of the restaurant
    * @param address the address of the restaurant
    */
   public Restaurant(String name, String cuisines, double numberRating, String address)
   {
      this.name = name;
      this.cuisines = cuisines;
      this.numberRating = numberRating;
      this.address = address;
   }

   // methods
   /**
    * Get the name of this restaurant.
    * @return the name of this restaurant
    */
   public String getName()
   {
      return this.name;
   }

   /**
    * Gets the cuisines offered by this restaurant.
    * @return the cuisines offered by this restaurant
    */
   public String getCuisines()
   {
      return this.cuisines;
   }

   /**
    * Gets the number rating of this restaurant.
    * @return the number rating of this restaurant
    */
   public double getNumberRating()
   {
      return this.numberRating;
   }

   /**
    * Gets this restaurant's address.
    * @return the address of the restaurant
    */
   public String getAddress()
   {
      return this.address;
   }
}
