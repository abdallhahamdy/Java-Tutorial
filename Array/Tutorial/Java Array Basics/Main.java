public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 20),
                new Student("Bob", 22),
                new Student("Charlie", 19)
        };

        for (Student student : students) {
            System.out.println(student.name + " is " + student.age + " years old.");
        }
    }
}
