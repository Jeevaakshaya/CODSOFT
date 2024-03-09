import java.util.List;

public class Student {
    private int studentID;
    private String name;
    private List<Course> registeredCourses; // Assuming Course is another class

    // Constructor
    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    // Getter and setter methods
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(List<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
}
