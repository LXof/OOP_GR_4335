package StudentDomen;

import java.util.List;

public class StudentGroup implements Comparable<StudentGroup> {
    
    
    private List<Student> students;
    private int groupID;    // Идентификатор группы
    
    public StudentGroup(List<Student> students, int groupID) {
        this.students = students;
        this.groupID = groupID;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public int getGroupID() {
        return groupID;
    }
    
    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }
    
    @Override
    public String toString() {
        return "StudentGroup [groupID=" + groupID + ", students=" + students + "]";
    }

    @Override
    public int compareTo(StudentGroup o) {
        int studentCountComparison = Integer.compare(this.students.size(), o.students.size());
        if (studentCountComparison != 0) {
            return studentCountComparison;
        }
        return Integer.compare(this.groupID, o.groupID);
    }
}