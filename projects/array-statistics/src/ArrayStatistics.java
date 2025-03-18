import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Ask for array size
        System.out.println("Please input the size of your array: ");
        int sizeOfArray = scanner.nextInt();
        int[] numbers = new int[sizeOfArray];

        // Fill the array
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Please enter " + (i+1) + ". value");
            int inputValue = scanner.nextInt();
            numbers[i] = inputValue;
        }

        // Results and Calculations
        System.out.println("Statistics:");

        // Sum
        int sum = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        // Average
        double average = (double) sum / sizeOfArray;
        System.out.println("Average: " + average);
        int max = numbers[0];
        for (int i = 1; i < sizeOfArray; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Minimum/Maximum Values
        int min = numbers[0];
        for (int i = 1; i < sizeOfArray; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Even/Odd Amount
        int evenCount = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        int oddCount = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Amount of even numbers: " + evenCount);
        System.out.println("Amount of odd numbers: " + oddCount);

        // Creating reverse array
        int[] numbersReverse = new int[sizeOfArray];
        int numbersIndex = 0;
        int numbersReverseIndex = numbers.length;

        while (0 < numbersReverseIndex) {
                numbersReverse[numbersReverseIndex-1] = numbers[numbersIndex];
                --numbersReverseIndex;
                ++numbersIndex;
        }
        System.out.print("Reversed array: ");
        for (int i = 0; i < numbersReverse.length; i++) {
            System.out.print(numbersReverse[i] + ", ");
        }
    }
}
