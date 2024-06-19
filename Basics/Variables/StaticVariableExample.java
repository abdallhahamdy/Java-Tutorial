public class StaticVariableExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John");
        Student s2 = new Student(102, "Doe");

        System.out.println(s1.name + " studies at " + Student.college);
        System.out.println(s2.name + " studies at " + Student.college);
    }
}
