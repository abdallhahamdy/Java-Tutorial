import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}

public class OnlineClassroom {
    public static void main(String[] args) {

        // 1. Initialization
        Set<Student> registeredStudents = new CopyOnWriteArraySet<>();
        System.out.println("Initial registered students: " + registeredStudents);

        // 2. Registering students
        registeredStudents.add(new Student("Amit Sharma", 101));
        registeredStudents.add(new Student("Ali", 102));
        registeredStudents.add(new Student("Omar", 103));
        System.out.println("After registration: " + registeredStudents);

        // 3. Iterating and registering a student during iteration
        for (Student student : registeredStudents) {
            System.out.println(student);
            if (student.toString().contains("Ali")) {
                registeredStudents.add(new Student("Abdo", 104));
            }
        }

        System.out.println("After registering a student during iteration: " + registeredStudents);
    }
}
