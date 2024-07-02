package Association.Example_2;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}
