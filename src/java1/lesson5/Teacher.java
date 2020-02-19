package java1.lesson5;

import java.util.ArrayList;

public class Teacher {

    ArrayList<Subject> subjects;
    String name, surname, fatherName;

    public Teacher(String surname, String name, String fatherName) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        subjects = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", surname, name, fatherName);
    }

    public void takeSubject(Subject subject) {
        subjects.add(subject);
        subject.teachers.add(this);
    }

//    public void showStudent() {
//        for (Student students : subjects.schedule.group) {
//            for (Teacher teacher : students.students) {
//                System.out.println(teacher);
//            }
//        }
//    }
}
