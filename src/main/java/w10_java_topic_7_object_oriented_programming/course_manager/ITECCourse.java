package w10_java_topic_7_object_oriented_programming.course_manager;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    String name;
    int code;
    List<String> students;
    int maxStudents;

    // Constructor
    ITECCourse(String courseName, int courseCode, int courseMaxStudents) {

        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<>();
        this.maxStudents = courseMaxStudents;
    }

    void addStudent(String studentName) {

        if (students.size() == maxStudents) {
            System.out.println("Course is full - can't add " + studentName);
        } else {
            students.add(studentName);
        }

    }

    int getNumberOfStudents() {
        return this.students.size();
    }

    void writeCourseInfo() {

        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled:");

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("There are " + getNumberOfStudents()
                + " students enrolled");

        System.out.println("The max number of students for this course is "
                + maxStudents);
    }

    void removeStudent(String studentName) {

        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + name);
        } else {
            System.out.println(studentName + " was not found in " + name);
        }
    }



}
