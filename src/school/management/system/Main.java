package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher niro1=new Teacher(1,"Niro1",5000);
        Teacher niro2=new Teacher(2,"Niro2",7000);
        Teacher niro3=new Teacher(3,"Niro3",8000);

        List<Teacher> sackTeachers=new ArrayList<>();
        sackTeachers.add(niro1);
        sackTeachers.add(niro2);
        sackTeachers.add(niro3);


        Student niro4=new Student(1,"Niro4",1);
        Student niro5=new Student(2,"Niro5",2);
        Student niro6=new Student(3,"Niro6",3);

        List<Student> sackStudents=new ArrayList<>();

        sackStudents.add(niro4);
        sackStudents.add(niro5);
        sackStudents.add(niro6);

        School sack=new School(sackTeachers,sackStudents);
        niro4.payFees(5000);
        niro5.payFees(6000);
        System.out.println(sack.getTotalMoneyEarned());

        System.out.println("----sack pay salary----");
//        System.out.println(niro4.getRemainingFees());
niro1.recieveSalary(niro1.getSalary());

    }
}
