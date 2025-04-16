import javax.xml.crypto.Data;
import java.io.*;
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

        System.out.println("Student created!");
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

        System.out.println("Course created!");
    }

    // Enroll student in a course
    public void enrollStudentInCourse(Scanner scanner) {
        // Taking input
        System.out.println("\nEnrolling student in a course");
        System.out.print("Student ID: ");
        String inputStudentID = scanner.nextLine();
        System.out.print("Course code: ");
        String inputCourseCode = scanner.nextLine();

        // Searching for student by ID
        boolean studentFound = false;
        Student studentToEnroll = null;
        for (Student student: students) {
            if (student.getStudentID().equalsIgnoreCase(inputStudentID)) {
                studentFound = true;
                studentToEnroll = student;
                break;
            }
        }
        // If student is found, searching course by ID
        boolean courseFound = false;
        Course courseToEnroll = null;
        if (studentFound) {
            for (Course course: courses) {
                if (course.getCourseCode().equalsIgnoreCase(inputCourseCode)) {
                    courseFound = true;
                    courseToEnroll = course;

                    // Adding course to student's registered courses if it doesn't exist already
                    if (!studentToEnroll.getRegisteredCourses().contains(courseToEnroll)) {
                        studentToEnroll.getRegisteredCourses().add(courseToEnroll);

                        System.out.println("Student enrolled in course!");
                    } else {
                        System.out.println("Student is already registered to this course!");
                    }
                    break;
                }
            }
        } else {
            System.out.println("Could not find matching results!");
        }
    }

    // Display all courses a student is enrolled in
    public void displayAllCoursesOfStudent(Scanner scanner) {
        // Taking input
        System.out.println("\nDisplaying all courses a student is enrolled in");
        System.out.print("Student ID: ");
        String inputStudentID = scanner.nextLine();

        // Search student by ID
        boolean studentFound = false;
        for (Student student: students) {
            if (student.getStudentID().equalsIgnoreCase(inputStudentID)) {
                studentFound = true;
                // Display all courses
                for (Course course: student.getRegisteredCourses()) {
                    System.out.println(course);
                }
                break;
            }
        }
        if (!studentFound) {
            System.out.println("Could not find that student!");
        }
    }

    // Display all students enrolled in a course
    public void displayAllStudentsOfClass(Scanner scanner) {
        // Taking input
        System.out.println("\nDisplaying all students of a course");
        System.out.print("Course Code: ");
        String inputCourseCode = scanner.nextLine();

        // Search for the course
        boolean courseFound = false;
        Course foundCourse = null;
        for (Course course: courses) {
            if (course.getCourseCode().equalsIgnoreCase(inputCourseCode)) {
                courseFound = true;
                foundCourse = course;
                break;
            }
        }
        // If course exists
        if (courseFound) {
            // Check every student if they're enrolled in that course
            ArrayList<Student> enrolledStudentsArrayList = new ArrayList<>();
            for (Student student: students) {
                for (Course course: student.getRegisteredCourses()) {
                    if (inputCourseCode.equalsIgnoreCase(course.getCourseCode())) {
                        // If yes, add them to the new arraylist.
                        enrolledStudentsArrayList.add(student);
                    }
                }
            }
            // If found students, display each of them, if not display a message
            if (!enrolledStudentsArrayList.isEmpty()) {
                System.out.println("Displaying all students in course " + foundCourse.getCourseCode());
                for (Student student: enrolledStudentsArrayList) {
                    System.out.println(student);
                }
            } else {
                System.out.println("Could not find any students enrolled in this class!");
            }
        } else {
            System.out.println("Could not find such a course!");
        }
    }

    public void saveData(Scanner scanner) {
        // Taking input
        System.out.println("\nSaving data");
        System.out.print("File name (*.txt): ");
        String inputFileName = scanner.nextLine();

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(inputFileName))) {
            outputStream.writeObject(students);
            outputStream.writeObject(courses);
        } catch (IOException e) {
            System.out.println("Error when saving data: " + e.getMessage());
        }
    }
}
