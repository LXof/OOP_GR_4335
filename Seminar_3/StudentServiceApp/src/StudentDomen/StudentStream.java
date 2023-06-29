package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{
    private int streamNumber;                   // Номер потока
    private List<StudentGroup> studentGroups;   // Список учебных групп

    public StudentStream(int streamNumber, List<StudentGroup> studentGroups) {
        this.streamNumber = streamNumber;
        this.studentGroups = studentGroups;
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(streamNumber, studentGroups);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Номер птока: ").append(streamNumber).append("\n");
        sb.append("Количество групп: ").append(studentGroups.size()).append("\n");
        sb.append("Студенты по группам: \n");
        for (StudentGroup group: studentGroups) {
            sb.append(group).append("\n");
        }
        return sb.toString();
    }
}
