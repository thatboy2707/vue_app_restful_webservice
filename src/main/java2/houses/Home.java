package houses;

//object will contain:
//{"address":661 brookline,"neighborhood":"Adair Park", "squareFootage":""}
//        Home{
//        address:
//        neighborhood:
//        squareFootage:
//        }

public class Home {
   private final String address;
    //private final String neighborhood;
    //private final int squareFootage;

    public Home(String address) {
       this.address = address;
        //this.neighborhood = neighborhood;
        //this.squareFootage = squareFootage;

    }

   public String getAddress() { return address;}
    //public String getNeighborhood() {return neighborhood;}
    //public int getSquareFootage() { return squareFootage;}



}


