package java1.lesson5;


import java.util.ArrayList;

public class Schedule {
    Group group;
    ArrayList<Subject> subjects;
    String scheduleId;
    private static int counter = 0;
    //alt + insert
    public Schedule(Group group) {
        this.group = group;
        group.schedule = this;
        scheduleId = "sch_" + group.groupId;
        subjects = new ArrayList<>();
        counter++;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append(group.groupId)
                .append('\n')
                .append(scheduleId)
                .append('\n');
        for (Subject subject : subjects) {
            out.append(subject).append('\n');
        }
        return out.toString();
    }

    public void addSubject(Subject subject) {
        subject.schedule = this;
        subjects.add(subject);
    }
}
