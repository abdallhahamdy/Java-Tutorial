package Aggregation.Example_2;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        for (Student student : students) {
            System.out.println("Student Roll Number: " + student.getRollNumber() + ", Name: " + student.getName());
        }
    }

    public String getName() {
        return name;
    }
}
