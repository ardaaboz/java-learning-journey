public class NumberValidator {
    public static void main(String[] args) {
        int numberPositive = 99;
        int numberNegative = -26;
        try {
            validateNumber(numberPositive);
            validateNumber(numberNegative);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
    public static void validateNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number can't be negative!");
        } else {
            System.out.println("Number is valid!");
        }
    }
}

