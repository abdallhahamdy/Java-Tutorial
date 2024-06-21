import java.io.*;
// import java.lang.reflect.Constructor;
// import java.lang.reflect.InvocationTargetException;

// public class Student implements Serializable {
// public class Student implements Cloneable {
public class Student {
    // private String name;
    private String name = "Ramesh";
    // private String college;
    private String college = "ABC";

    public Student() {
        super();
    }

    public Student(String name, String college) {
        super();
        this.name = name;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

     public static void main(String[] args) {

        // 1. Using a new keyword
        // Student student = new Student("Ramesh", "BVB");
        // Student student2 = new Student("Prakash", "GEC");
        // Student student3 = new Student("Pramod", "IIT");

        // 2. Using newInstance() method of Class class
        /*try {

            String className = "Student";
            Class clasz = Class.forName(className);
            Student student = (Student) clasz.newInstance();
            System.out.println(student.getName());
            System.out.println(student.getCollege());

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        // 3. Using newInstance() method of Constructor class
        /* Constructor < Student > constructor;
        try {
            constructor = Student.class.getConstructor();
            Student student = constructor.newInstance();
            System.out.println(student.getName());
            System.out.println(student.getCollege());
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } */

        // 4. Using Object Deserialization
         // Path to store the Serialized object
        /* String filePath = "sample.txt";
         Student s1 = new Student("Ramesh", "ABC");
         try {
             FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
             outputStream.writeObject(s1);
             outputStream.flush();
             outputStream.close();

             FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
             Student s2 = (Student) inputStream.readObject();

             inputStream.close();

             System.out.println(s2.getName());
             System.out.println(s2.getCollege());

         } catch (Exception ee) {
             ee.printStackTrace();
         } */

         // 5. Using Object Cloning – clone() method
         Student student1 = new Student("Ramesh", "ABC");
         try {
             Student student2 = (Student) student1.clone();
             System.out.println(student2.getName());
             System.out.println(student2.getCollege());
         } catch (CloneNotSupportedException e) {
             e.printStackTrace();
         }
    }
}