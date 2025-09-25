public class PersonalInfo {
    public static void main(String[] args) {

        // Declaring variables
        String name = "Arda";
        int age = 19;
        double height = 1.72;
        boolean isStudent = true;

        // Calculations
        int ageInYears = 19 * 365;
        double heightInCentimeters = 1.72 * 100;

        // Printing out
        System.out.println("Your name is: " + name);
        System.out.println("You are approximately " + ageInYears + " days old!");
        System.out.println("You are " + heightInCentimeters + " centimeters long!");
        System.out.println("Student status: " + isStudent);
    }
}