package java1.lesson5;

import java.util.ArrayList;

public class Group {

    ArrayList<Student> students;
    Schedule schedule;
    String groupId;
    private static int counter = 0;

    public Group() {
        groupId = "gr_" + counter;
        counter++;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        student.addToGroup(this);
        students.add(student);
    }
}
