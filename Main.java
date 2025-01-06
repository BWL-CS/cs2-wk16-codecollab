public class Main {

   public static void main(String []args) {
      PropertyCard defaultCard = new PropertyCard();
      System.out.println("Default Property Card:");
      System.out.println(defaultCard);
      
      PropertyCard parkPlace = new PropertyCard("Park Place", "Blue", 350, 35, 50);
      System.out.println("\nParameterized Property Card:");
      System.out.println(parkPlace);
      
      parkPlace.addHouse();
      parkPlace.addHouse();
      System.out.println("\nAfter adding houses:");
      System.out.println(parkPlace);
      
      parkPlace.removeHouse();
      System.out.println("\nAfter removing a house:");
      System.out.println(parkPlace);
      
      parkPlace.mortgage();
      System.out.println("\nAfter mortgaging the property:");
      System.out.println(parkPlace);
      
      parkPlace.unmortgage();
      System.out.println("\nAfter unmortgaging the property:");
      System.out.println(parkPlace);
   }
}
