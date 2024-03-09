import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create objects and call methods to interact with your program
        Student student = new Student(1, "John"); // Example student
        Course course = new Course("CSCI101", "Introduction to Computer Science", "An introductory course to computer science", 20, List.of("Monday", "Wednesday")); // Example course

        // Register the student for the course
        StudentRegistration.registerCourse(student, course);

        // List available courses
        List<Course> courses = List.of(course); // Example list of courses
        CourseListing.displayCourses(courses);

        // Drop a course
        CourseRemoval.dropCourse(student, course);
    }
}
