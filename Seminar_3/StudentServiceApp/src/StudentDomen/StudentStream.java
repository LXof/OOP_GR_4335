package StudentDomen;

import java.util.List;

public class StudentStream {
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

}
