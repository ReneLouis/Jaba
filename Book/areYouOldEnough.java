import java.util.Scanner;

public class areYouOldEnough {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name:");
		String name = scanner.nextLine();

		System.out.printf("Howdy %s, how old are you?", name);
		int age = scanner.nextInt();

		if (age >= 60) {
			System.out.printf("Well %s, as you are %d years old, you can enter the app.", name, age);
		} else {
			System.out.printf("Ah! Sorry %s, at %d you're too young to retire!", name, age);
		}			
	scanner.close();
	}
}

