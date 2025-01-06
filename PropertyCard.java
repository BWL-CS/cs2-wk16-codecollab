public class PropertyCard {
    // Instance variables
    private String name;
    private String color;
    private int price;
    private int rent;
    private int houseCost;
    private int numHouses;
    private boolean mortgaged;

    // Default constructor
    public PropertyCard() {
        this.name = "Unknown";
        this.color = "None";
        this.price = 0;
        this.rent = 0;
        this.houseCost = 0;
        this.numHouses = 0;
        this.mortgaged = false;
    }

    // Parameterized constructor
    public PropertyCard(String name, String color, int price, int rent, int houseCost) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.rent = rent;
        this.houseCost = houseCost;
        this.numHouses = 0;
        this.mortgaged = false;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getRent() {
        return rent;
    }

    public int getHouseCost() {
        return houseCost;
    }

    public int getNumHouses() {
        return numHouses;
    }

    public boolean isMortgaged() {
        return mortgaged;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public void setHouseCost(int houseCost) {
        this.houseCost = houseCost;
    }

    public void setNumHouses(int numHouses) {
        this.numHouses = numHouses;
    }

    public void setMortgaged(boolean mortgaged) {
        this.mortgaged = mortgaged;
    }

    // Behavior methods

    // Add a house to the property
    public void addHouse() {
        numHouses++;
        rent *= 2; // Rent doubles with each house added (example rule)
    }

    // Remove a house from the property
    public void removeHouse() {
        if (numHouses > 0) {
            numHouses--;
            rent /= 2; // Rent halves when a house is removed (example rule)
        }
    }

    // Mortgage the property
    public void mortgage() {
        if (!mortgaged) {
            mortgaged = true;
        }
    }

    // Unmortgage the property
    public void unmortgage() {
        if (mortgaged) {
            mortgaged = false;
        }
    }

    @Override
    public String toString() {
        return "PropertyCard[" +
               "name='" + name + '\'' +
               ", color='" + color + '\'' +
               ", price=" + price +
               ", rent=" + rent +
               ", houseCost=" + houseCost +
               ", numHouses=" + numHouses +
               ", mortgaged=" + mortgaged +
               ']';
    }
}
