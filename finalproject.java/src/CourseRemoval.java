public class CourseRemoval {
    public static void dropCourse(Student student, Course course) {
        if (student.getRegisteredCourses().contains(course)) {
            student.getRegisteredCourses().remove(course);
            course.setCapacity(course.getCapacity() + 1);
            System.out.println("Course dropped successfully!");
        } else {
            System.out.println("You are not registered for this course.");
        }
    }
}
