package java1.lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    // Информация о студентах учителя
    // Информация об учителях студента
    // Информация о предметах студента
    // Расписание студента : пердмет, время, учитель
    // Сделать две группы из 10 студентов каждая с различными расписаниями
    // математика 12:00 и математика 15:30 - разные объекты
    // 1 предмет для одного студента не могут вести два препода
    public static void main(String[] args) {

        Student[] students1 = new Student[10];
        Student[] students2 = new Student[10];
        for (int i = 0; i < 10; i++) {
            students1[i] = new Student("Ivanov " + i, "I", "I");
            students2[i] = new Student("Petrov " + i, "P", "I");
        }


        Group group1 = new Group();
        Group group2 = new Group();
        group1.schedule = new Schedule(group1);
        group2.schedule = new Schedule(group2);
        Schedule schedule1 = group1.schedule;
        Schedule schedule2 = group2.schedule;

        for (int i = 0; i < students1.length; i++) {
            students1[i].addToGroup(group1);
            students2[i].addToGroup(group2);
        }

        Subject sub1 = new Subject("Mathematics", "12:00");
        Subject sub2 = new Subject("Mathematics", "15:30");
        Subject sub3 = new Subject("Programming Language", "12:00");
        Subject sub4 = new Subject("Programming Language", "15:30");
        schedule1.addSubject(sub1);
        schedule1.addSubject(sub4);
        schedule2.addSubject(sub3);
        schedule2.addSubject(sub2);
        Teacher mathTeacher1 = new Teacher("Gleym", "Eric", "Hildson");
        Teacher infTeacher1 = new Teacher("Korotkevich", "Gennadiy", "Batkovich");
        Teacher mathTeacher2 = new Teacher("Jacobi", "Carl", "Gustav");
        Teacher infTeacher2 = new Teacher("Sierra", "Kathy", "B");
        sub1.applyTeacher(mathTeacher1);
        sub2.applyTeacher(mathTeacher2);
        //sub2.applyTeacher(mathTeacher1);
        sub3.applyTeacher(infTeacher1);
        sub4.applyTeacher(infTeacher2);
        //sub4.applyTeacher(infTeacher1);

        System.out.printf("Информация об учителях студента   " + students1[0] + ":\n");
        students1[0].showTeacher();
        System.out.printf("\nИнформация об учителях студента   " + students2[0] + ":\n");
        students2[0].showTeacher();
        System.out.printf("\nИнформация о студентах учителя " + mathTeacher2 + ":\n");
        mathTeacher2.showStudent();
        System.out.printf("\nИнформация о студентах учителя " + infTeacher2 + ":\n");
        infTeacher2.showStudent();
        System.out.printf("\nИнформация о предметах студента " + students1[1] + ":\n");
        System.out.println(students1[2].getGroup().schedule.subjects);
        System.out.printf("\nИнформация о предметах студента " + students2[1] + ":\n");
        System.out.println(students2[2].getGroup().schedule.subjects);
        System.out.printf("\nРасписание студента " + students1[2] + ": предмет, время, учитель " + ":\n");
        students1[3].showStudentSchedule();
        System.out.printf("\nРасписание студента " + students2[2] + ": предмет, время, учитель " + ":\n");
        students2[3].showStudentSchedule();

    }
}
