package w10_java_topic_7_object_oriented_programming.course_manager;

public class ITECCourseManager {

    public static void main(String[] args) {

        ITECCourse maintenanceCourse =
                new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.writeCourseInfo();


        ITECCourse datacomCourse =
                new ITECCourse("Data Communications", 1424, 30);

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        // less code
        ITECCourse projectCourse =
                new ITECCourse("Software Development Projects", 2903, 24);

        // Add students
        projectCourse.addStudent("Gus");
        projectCourse.addStudent("Harry");
        projectCourse.addStudent("Izzy");

        // Print number of students
        System.out.println(projectCourse.getNumberOfStudents());

        // Carl decided to drop the class
        maintenanceCourse.removeStudent("Carl");

        maintenanceCourse.writeCourseInfo();
    }
}
