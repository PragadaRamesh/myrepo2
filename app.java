import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to Java programming.");

        // Ask the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the user is an adult
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult yet.");
        }

        // Close the scanner
        scanner.close();
    }
}

\\devoleper 2 code is added

    public class Main {
   public static void main(String[] args) {
       System.out.println("Hello World");
   }
}
