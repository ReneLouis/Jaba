import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I am computer, What is your name?");
        String name = scanner.nextLine();

        System.out.printf("Howdy %s, How many springs old are you?\n", name);
        int age = scanner.nextInt();

        // consumes the dangling new line character
        scanner.nextLine();

        if (age < 18) {
            System.out.println(String.format("Well, I do surely hope you've had fun during those %d years! Sadly you'll need a few more to access this app.", age));
        } else if (age >= 55) {
            System.out.printf("Wait, you really are %d? You can access the app but you may be a bit old for it..", age);
        } else {
            System.out.printf("Okay, %d is an acceptable age to access this app, so enjoy %s. \nWhat bike have you got?\n", age, name);
            String bikeModel = scanner.nextLine();

            System.out.printf("What the engine size of %s?\n", bikeModel);
            short size = scanner.nextShort();
            System.out.printf("So to resume, you are %s, %d years old, and ride a %dcc %s, nice one!", name, age, size, bikeModel);
        }


        scanner.close();
    }
}
