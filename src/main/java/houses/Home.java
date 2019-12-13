package houses;

public class Home {
    private final String address;
    private final String neighborhood;
    private final int squareFootage;

    public Home(String address, int squareFootage, String neighborhood) {
        this.address = address;
        this.squareFootage = squareFootage;
        this.neighborhood = neighborhood;
    }

public String getAddress() { return address;}
    public int getSquareFootage() { return squareFootage;}
    public String getNeighborhood() {return neighborhood;}


}


