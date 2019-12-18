//package hello.houses;
//
//public class scratch {
//
//    HomeController.java
//package houses;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//    @RestController
//    public class HomeController {
//        private String address;
//        //  private int squareFootage;
//        private String neighborhood;
//
//        @RequestMapping("/home")
//        private Home home(@RequestParam(value = "address", defaultValue = "house") String address,
//                          @RequestParam(value = "neighborhood", defaultValue = "area") String neighborhood) {
//            this.address = address;
//            //this.squareFootage = squareFootage;
//            this.neighborhood = neighborhood;
//            //return new Home(String.format(template, address,neighborhood)); //int.format(squareFootage));
//            return new Home(address, neighborhood);
//        }
//
//    }
//
//
//
//-----2nd edited version------
//
//            package houses;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//    @RestController
//    public class HomeController {
//        private String address;
//        //private int squareFootage;
//        //private String neighborhood;
//
//        @RequestMapping("/home")
//        private Home home(@RequestParam(value = "address", defaultValue = "house") String address) {
//            this.address = address;
//            //return new Home(String.format(template, address,neighborhood)); //int.format(address));
//            return new Home(address);
//        }
//
//    }
//}
