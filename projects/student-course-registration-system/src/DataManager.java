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

}
