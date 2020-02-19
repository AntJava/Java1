package java1.lesson5;

public class Student {

    private String name, surname, fatherName;
    private int age;
    private String address, passCode;
    private Group group;

    public Student(String surname, String name, String fatherName) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
    }

    public Group getGroup() {
        return group;
    }

    public void showTeacher() {
        for (Subject subject : group.schedule.subjects) {
            for (Teacher teacher : subject.teachers) {
                System.out.println(teacher);
            }
        }
    }

    public void showStudentSchedule() {
        for (Subject subject : group.schedule.subjects) {
            System.out.print(subject + " : ");
            for (Teacher teacher : subject.teachers) {
                System.out.println(teacher);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", surname, name, fatherName);
    }

    public void addToGroup(Group group) {
        this.group = group;
        group.students.add(this);
    }
}
