public class StudentRegistration {
    public static void registerCourse(Student student, Course course) {
        if (student.getRegisteredCourses().size() < 5 && course.getCapacity() > 0) {
            student.getRegisteredCourses().add(course);
            course.setCapacity(course.getCapacity() - 1);
            System.out.println("Course registered successfully!");
        } else {
            System.out.println("Failed to register for the course.");
        }
    }
}
