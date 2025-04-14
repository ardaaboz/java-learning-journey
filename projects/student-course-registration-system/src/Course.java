public class Course {
    // Encapsulated fields
    private String courseCode;
    private String courseTitle;
    private String courseInstructor;
    // Constructor
    Course(String courseCode, String courseTitle, String courseInstructor) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseInstructor = courseInstructor;
    }
    // Getters and setters

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }
}
