import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        // 1. Initialization
        List<Student> studentList = new CopyOnWriteArrayList<>();
        System.out.println("Initialized student records: " + studentList);

        // 2. Adding students
        studentList.add(new Student("John Doe", 101));
        studentList.add(new Student("Jane Smith", 102));
        studentList.add(new Student("Sam Brown", 103));
        System.out.println("After adding students: " + studentList);

        // 3. Iterate and add new student during iteration
        for (Student student : studentList) {
            System.out.println(student);
            if (student.toString().contains("Jane Smith")) {
                studentList.add(new Student("Emma White", 104));
            }
        }

        System.out.println("After adding student during iteration: " + studentList);
    }
}