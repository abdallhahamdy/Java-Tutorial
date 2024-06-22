package NewKeyword;

public class NewKeyword {

    public static void main(String[] args) {

        // use new keyword to create custom object type
        Student student = new Student("Tom", 20);

        // use new keyword to create int array object
        int[] intArray = new int[10];

        // use new keyword to create string object
        String string = new String();

        // use new keyword to create instance of object
        Object object = new Object();
    }
}

class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
}
