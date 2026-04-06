public class Main{
    public static void main(String[] args)
    {
      /*
      Car car = new Car();

      car.setMake("Porsche");
      car.setModel("Carrera");
      car.setDoors(2);
      car.setConvertible(true);
      car.setColor("Black");

      System.out.println("make = " + car.getMake());
      System.out.println("model = " + car.getModel());
      car.describeCar();
      */

       // Account bobsAccount = new Account(
       //         "12345", 1000.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");

        /*
        for(int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch(i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Lisa";
                        default -> "Anonymous";
                    }, "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        LPAStudent student = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(student);

        System.out.println(student.name() + " is taking " + student.classList());

        // record is immutable
        */

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}

