import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataManager {
    // Stores all registered students
    private ArrayList<Student> students = new ArrayList<>();
    // Stores all registered courses
    private ArrayList<Course> courses = new ArrayList<>();

    // Getters
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public HashMap<String, ArrayList<Course>> getRegistrations() {
        return registrations;
    }
    // Methods

    // Adding a student
    public void addStudent(Scanner scanner) {
        // Taking input
        System.out.println("\nCreating a student");
        System.out.print("ID: ");
        String inputStudentID = scanner.nextLine();
        System.out.print("Name: ");
        String inputStudentName = scanner.nextLine();

        // Creating new student and adding it to the students array list
        Student newStudent = new Student(inputStudentID,inputStudentName);
        students.add(newStudent);
    }

    // Adding a course
    public void addCourse(Scanner scanner) {
        // Taking input
        System.out.println("\nCreating a course");
        System.out.print("Code: ");
        String inputCourseCode = scanner.nextLine();
        System.out.print("Title: ");
        String inputCourseTitle = scanner.nextLine();
        System.out.print("Instructor: ");
        String inputCourseInstructor = scanner.nextLine();

        // Creating new course and adding it to the courses array list
        Course newCourse = new Course(inputCourseCode, inputCourseTitle, inputCourseInstructor);
        courses.add(newCourse);
    }


}
