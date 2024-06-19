public class InstanceVariableExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.id = 101;
        emp1.empName = "John";
        emp1.age = 30;

        emp2.id = 102;
        emp2.empName = "Doe";
        emp2.age = 25;

        System.out.println(emp1.empName + " is " + emp1.age + " years old.");
        System.out.println(emp2.empName + " is " + emp2.age + " years old.");
    }
}
