public class Main {

   public static void main(String []args) {
      // Creating a default property card
      PropertyCard defaultCard = new PropertyCard();
      System.out.println("Default Property Card:");
      System.out.println(defaultCard);
      
      // Creating a parameterized property card
      PropertyCard parkPlace = new PropertyCard("Park Place", "Blue", 350, 35, 50);
      System.out.println("\nParameterized Property Card:");
      System.out.println(parkPlace);
      
      // Adding houses
      parkPlace.addHouse();
      parkPlace.addHouse();
      System.out.println("\nAfter adding houses:");
      System.out.println(parkPlace);
      
      // Removing a house
      parkPlace.removeHouse();
      System.out.println("\nAfter removing a house:");
      System.out.println(parkPlace);
      
      // Mortgaging the property
      parkPlace.mortgage();
      System.out.println("\nAfter mortgaging the property:");
      System.out.println(parkPlace);
      
      // Unmortgaging the property
      parkPlace.unmortgage();
      System.out.println("\nAfter unmortgaging the property:");
      System.out.println(parkPlace);
   }
}
