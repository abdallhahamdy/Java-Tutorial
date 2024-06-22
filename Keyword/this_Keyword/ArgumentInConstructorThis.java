package this_Keyword;

public class ArgumentInConstructorThis {
    public static void main(String[] args) {
        ClassB classB = new ClassB(10, "Demo");
    }
}

class ClassA {

    ClassB classB;
    public ClassA(ClassB classB) {
        this.classB = classB;
        printClassB();
    }

    public void printClassB() {
        System.out.println(this.classB.getId());
        System.out.println(this.classB.getName());
    }
}

class ClassB {
    private int id;
    private String name;

    public ClassB(int id, String name) {
        this.id = id;
        this.name = name;

        new ClassA(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}