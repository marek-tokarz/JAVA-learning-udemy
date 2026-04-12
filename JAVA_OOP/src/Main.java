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


        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");


        // Text blocks and advanced formatting
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point\n";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                        \u2022 First Point
                            \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for(int i = 1; i < 100000; i *= 10) {
            System.out.printf("Printing %6d %n",i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");
        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of r = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of r = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of r = %d %n", helloWorld.indexOf('l',3));
        System.out.printf("index of r = %d %n", helloWorld.lastIndexOf('l',8));

        // String class methods - inspecting and comparing
        String helloWolrdLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWolrdLower)) {
            System.out.println("Values match exactly");
        }

        if(helloWorld.equalsIgnoreCase(helloWolrdLower)) {
            System.out.println("Values match ignoring case");
        }

        // String class methods - manipulating

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("StartingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        System.out.println("Month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate " + newDate );

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate " + newDate );

        System.out.println(newDate.replace('/', '-') );
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replace("/", "-") );
        System.out.println(newDate.replace("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("      ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

         */

        // StringBuilder

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye"); // will not change an above String

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }

    /*
    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if(string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if(string.isBlank()) {
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Lat character = %c %n", string.charAt(length-1));
    }
      */

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}

