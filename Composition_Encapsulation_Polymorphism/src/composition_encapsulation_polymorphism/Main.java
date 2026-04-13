package composition_encapsulation_polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Personal computer and its parts example
/*
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase,theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();

        // Smart Kitchen and kithcen appliances example

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffe();

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();

//      Player player = new Player();
//      player.name = "Tim";
//      player.health = 20;
//      player.weapon = "Sword";
//
//      int damage = 10;
//      player.loseHealth(damage);
//      System.out.println("Remaining health = " + player.healthRemaining());
//      // player.health = 200 // setting a health without a proper method - outside the methods - BAD DESIGN
//      player.loseHealth(11);
//      System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Inital health is " + tim.healthRemaining());

        Printer printer = new Printer(50,true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        Movie theMovie1 = new Movie("Star Trek");
        theMovie1.watchMovie();

        Movie theAdventureMovie = new Adventure("Star Wars");
        theAdventureMovie.watchMovie();

        Movie theMovie2 = Movie.getMovie("Science", "Star Wars 2");
        theMovie2.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }
    */

    Car car = new Car("2022 Blue Ferrari 296 GTS");
    runRace(car);

    Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
            15.4, 6);

    runRace(ferrari);

    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }

}
