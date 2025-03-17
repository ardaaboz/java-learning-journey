import java.lang.reflect.Field;
import java.util.Scanner;

public class TemperatureConverter {
    // Declare variables

    public static void main(String[] args) {

        // Declare variables
        double temperatureValue = 0;
        char currentUnit = 0;
        char targetUnit = 0;
        double result = 0;
        char yesNo = 0;

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Boolean to control menu
        boolean keepRunning = true;

        // Menu
        while (keepRunning == true) {
            System.out.println("\nWelcome to Temperature Converter");
            System.out.println("Enter the temperature value: ");
            if (scanner.hasNextDouble()) {
                temperatureValue = scanner.nextDouble();
            } else {
                System.out.println("Please enter a valid input!");
            }

            System.out.println("Enter the current unit (C/F/K): ");
            currentUnit = scanner.next().charAt(0);
            currentUnit = Character.toUpperCase(currentUnit);
            if (currentUnit == 'C' || currentUnit == 'F' || currentUnit == 'K') {}
            else {
                System.out.println("Please enter a valid input!");
                continue;
            }

            System.out.println("Enter the target unit (C/F/K): ");
                targetUnit = scanner.next().charAt(0);
                targetUnit = Character.toUpperCase(targetUnit);
            if (targetUnit == 'C' || targetUnit == 'F' || targetUnit == 'K') {}
            else {
                System.out.println("Please enter a valid input!");
                continue;
            }

            if (currentUnit == 'C' && targetUnit == 'F') {
                result = celciusToFahrenheit(temperatureValue);
                System.out.printf("Result: %.2f\n", result);;
            } else if (currentUnit == 'F' && targetUnit == 'C') {
                result = fahrenheitToCelcius(temperatureValue);
                System.out.printf("Result: %.2f\n", result);;
            } else if (currentUnit == 'C' && targetUnit == 'K') {
                result = celciusToKelvin(temperatureValue);
                System.out.printf("Result: %.2f\n", result);;
            } else if (currentUnit == 'K' && targetUnit == 'C') {
                result = kelvinToCelcius(temperatureValue);
                System.out.printf("Result: %.2f\n", result);;
            } else if (currentUnit == 'F' && targetUnit == 'K') {
                result = fahrenheitToKelvin(temperatureValue);
                System.out.printf("Result: %.2f\n", result);;
            } else if (currentUnit == 'K' && targetUnit == 'F') {
                result = kelvinToFahrenheit(temperatureValue);
                System.out.printf("Result: %.2f\n", result);;
            } else {
                System.out.println("Current and target units are the same.\nResult: " + temperatureValue);
            }
            System.out.println("Would you like to do more? (Y/N)");
            yesNo = scanner.next().charAt(0);
            yesNo = Character.toUpperCase(yesNo);
            if (yesNo == 'N' || yesNo == 'Y') {
                switch (yesNo) {
                    case  'Y':
                        keepRunning = true;
                        break;
                    case  'N':
                        System.out.println("Exiting...");
                        keepRunning = false;
                        break;
                }
            } else {
                System.out.println("Invalid input!");
                continue;
            }
        }
    }


    // Calculations
    public static double celciusToFahrenheit(double value1) {
        return (value1 * 9/5) + 32;
    }
    public static double fahrenheitToCelcius(double value1) {
        return (value1 - 32) * 5/9;
    }
    public static double celciusToKelvin(double value1) {
        return value1 + 273.15;
    }
    public static double kelvinToCelcius(double value1) {
        return value1 - 273.15;
    }
    public static double fahrenheitToKelvin (double value1) {
        return (value1 - 32) * 5/9 + 273.15;
    }
    public static double kelvinToFahrenheit (double value1) {
        return (value1 - 273.15) * 9/5 + 32;
    }
}