package this_Keyword;

public class ArgumentInMethodThis {
    public static void main(String[] args) {
        Student student = new Student("Ramesh", "STU100", "Physics");
        student.print();
    }
}

class Student {
    private String name;
    private String rollNo;
    private String course;

    public Student(String name, String rollNo, String course) {
        super();
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void print() {
        printStudent(this);
    }

    public void printStudent(Student student) {
        System.out.println(student.name);
        System.out.println(student.course);
        System.out.println(student.rollNo);
    }
}