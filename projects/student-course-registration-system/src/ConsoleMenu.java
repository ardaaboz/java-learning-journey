import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        Scanner scanner = new Scanner(System.in);

        boolean menuIsRunning = true;
        while (menuIsRunning) {
            System.out.println("\nWelcome to Student Course Registiration System");
            System.out.println("1. Add a student");
            System.out.println("2. Add a course");
            System.out.println("3. Enroll student in a course");
            System.out.println("4. View all courses of a student");
            System.out.println("5. View all students in a course");
            System.out.println("6. Save data");
            System.out.println("7. Load data");
            System.out.println("8. Exit");
            int menuInput = scanner.nextInt();
            scanner.nextLine(); // Clear scanner

            switch (menuInput) {
                case 1:
                    dataManager.addStudent(scanner);
                    break;
                case 2:
                    dataManager.addCourse(scanner);
                    break;
                case 3:
                    dataManager.enrollStudentInCourse(scanner);
                    break;
                case 4:
                    dataManager.displayAllCoursesOfStudent(scanner);
                    break;
                case 5:
                    dataManager.displayAllStudentsOfClass(scanner);
                    break;
                case 6:
                    dataManager.saveData(scanner);
                    break;
                case 7:

                    break;
                case 8:
                    menuIsRunning = false;
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("Enter a valid input!");
                    break;
            }
        }


    }
}
