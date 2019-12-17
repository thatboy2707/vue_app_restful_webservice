package hello.houses;

//object will contain:
//{"address":661 brookline,"neighborhood":"Adair Park", "squareFootage":""}
//        Home{
//        address:
//        neighborhood:
//        squareFootage:
//        }

public class Home {
    private  String address;
    private  String neighborhood;
    private  int squareFootage;

    public Home() {

    }

    public Home(String address, String neighborhood, int squareFootage) {
       this.address = address;
        this.neighborhood = neighborhood;
        this.squareFootage = squareFootage;

    }

    public String getAddress() { return address;}
    public String getNeighborhood() {return neighborhood;}
    public int getSquarefootage() {return squareFootage;}
// command + N to make "setters"
    public void setAddress(String address) {
        this.address = address;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }
}


