package StudentDomen;

import java.util.List;

public class StudentGroup implements Comparable<StudentGroup> {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    @Override
    public String toString() {
        return "StudentGroup [students=" + students.toString() + "]";
    }

    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(this.students.size(), o.students.size());
    }
    
}