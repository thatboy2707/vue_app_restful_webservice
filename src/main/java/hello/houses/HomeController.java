package hello.houses;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private static final String template = "Which Home, %s!";
//    private String address;
   //private int squareFootage;
//   private String neighborhood;

    @RequestMapping("/home")
    private Home home(@RequestParam(value = "address", defaultValue = "house") String address) {
        //Home= Class  newHome= variable    new Home()= object/instance of Home.java Class
        Home newHome = new Home();

        newHome.setAddress(address);
        newHome.setNeighborhood("area");
        newHome.setSquareFootage(1200);

//        this.address = address;
//        this.neighborhood = neighborhood;
        //return new Home(String.format(template, address,neighborhood)); //int.format(address));
//        return new Home(String.format(template, address, neighborhood));

        return newHome;
    }

}


