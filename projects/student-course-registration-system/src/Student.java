import java.util.ArrayList;

public class Student {
    // Encapsulated fields
    private String studentID;
    private String studentName;
    private ArrayList<Course> registeredCourses = new ArrayList<>();
    // Constructor
    Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
    // Getters and setters
    public String getStudentID() {
        return studentID;
    }
    public String getStudentName() {
        return studentName;
    }

    public ArrayList<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Overriding toString to display student information
    public String toString() {
        return "\nID: " + getStudentID() +
                "Name: " + getStudentName() +
    }
}
