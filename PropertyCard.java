public class PropertyCard {
    
    // 1. INSTANCE VARIABLES

    private String name;
    private String color;
    private int price;
    private int rent;
    private int houseCost;
    private int numHouses;
    private boolean mortgaged;

    // 2. CONSTRUCTORS

    public PropertyCard() {
        this.name = "Unknown";
        this.color = "None";
        this.price = 0;
        this.rent = 0;
        this.houseCost = 0;
        this.numHouses = 0;
        this.mortgaged = false;
    }

    public PropertyCard(String name, String color, int price, int rent, int houseCost) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.rent = rent;
        this.houseCost = houseCost;
        this.numHouses = 0;
        this.mortgaged = false;
    }

    // 3. METHODS

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

    public void addHouse() {
        numHouses++;
        rent *= 2;
    }

    public void removeHouse() {
        if (numHouses > 0) {
            numHouses--;
            rent /= 2; 
        }
    }

    public void mortgage() {
        if (!mortgaged) {
            mortgaged = true;
        }
    }

    public void unmortgage() {
        if (mortgaged) {
            mortgaged = false;
        }
    }

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
