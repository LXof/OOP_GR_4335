
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("John", "Doe", 23);
        Student s1 = new Student("John", "Doe", 23, 101);
        Student s2 = new Student("Даша", "Телепнева", 21, 111);
        Student s3 = new Student("Владислав", "Наджахов", 21, 121);
        Student s4 = new Student("Леша", "Сидоров", 21, 301);
        Student s5 = new Student("Михаил", "Петров", 23, 171);
        Student s6 = new Student("Семен", "Адамов", 23, 104);

        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group = new StudentGroup(listStud);

        
        for (Student stud : group) {
            System.out.println(stud.toString());
        }
        
        Collections.sort(group.getStudents());
        System.out.println("================== После сортировки ======================");
        
        for (Student stud : group) {
            System.out.println(stud.toString());
        }
        
        
        // System.out.println(u1.toString());     // User [firstName='Адамов', secondName='Семен', age=23]
        // System.out.println(s1.toString());     // Student [studentID=101, firstName='Вячеслав', secondName='Сахоров', age=22]

        // System.out.println(group);  // StudentDomen.StudentGroup@279f2327
    }
}

