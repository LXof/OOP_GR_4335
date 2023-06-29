
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;
public class App {
    public static void main(String[] args) throws Exception {
        
        //Создание списка учебных групп
        List<StudentGroup> studentGroups = new ArrayList<>();

        
        //Создание группы 1
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Владислав", "Наджахов", 23, 102));
        students1.add(new Student("Леша", "Сидоров", 20, 106));
        students1.add(new Student("Михаил", "Петров", 19, 103));
        students1.add(new Student("Артем", "Петров", 19, 103));
        StudentGroup group1 = new StudentGroup(students1, 1);
        studentGroups.add(group1);
        
        //Создание группы 2
        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Александр", "Петрович", 20, 109));
        students2.add(new Student("Даша", "Телепнева", 21, 104));
        StudentGroup group2 = new StudentGroup(students2, 2);
        studentGroups.add(group2);
        
        //Создание группы 3
        List<Student> students3 = new ArrayList<>();
        students3.add(new Student("Андрей", "Ковалев", 21, 137));
        students3.add(new Student("Алина", "Федорова", 20, 111));
        students3.add(new Student("Денис", "Морозов", 22, 120));
        students3.add(new Student("Наталья", "Козлова", 23, 173));
        students3.add(new Student("Игорь", "Волков", 23, 150));
        StudentGroup group3 = new StudentGroup(students3, 3);
        studentGroups.add(group3);

        //Создание группы 4
        List<Student> students4 = new ArrayList<>();
        students4.add(new Student("Алексей", "Иванов", 22, 107));
        students4.add(new Student("Екатерина", "Смирнова", 21, 101));
        students4.add(new Student("Иван", "Попов", 20, 113));
        students4.add(new Student("Ольга", "Соколва", 22, 110));
        StudentGroup group4 = new StudentGroup(students4, 4);
        studentGroups.add(group4);

        // Создание потока студентов
        StudentStream studentStream = new StudentStream(1, studentGroups);

        // Сортировка групп студентов по количеству студентов и идентификатору группы
        Collections.sort(studentStream.getStudentGroups());

        // Вывод групп со списками стдентов
        for (StudentGroup group : studentStream) {
            System.out.println("Группа " + group.getGroupID() + ":");
            for (Student student : group.getStudents()) {
                System.out.println(student);                
            }
            System.out.println("------------------");
        }
    }
}

