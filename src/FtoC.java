import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = 0.0;
        double celsius = 0.0;
        boolean validInput = false;

        do {
            System.out.print("Enter the temperature in Fahrenheit: ");
            if (scanner.hasNextDouble()) {
                fahrenheit = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        } while (!validInput);


        celsius = (fahrenheit - 32) * 5/9;


        System.out.println("The temperature in Celsius is: " + celsius + " degrees.");
    }
}

