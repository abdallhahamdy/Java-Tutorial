package this_Keyword;

public class ThisReturnExample {
    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        demoClass.test().print();
    }
}

class DemoClass {
    public DemoClass test() {
        return this;
    }

    public void print() {
        System.out.println("Inside Demo Class");
    }
}