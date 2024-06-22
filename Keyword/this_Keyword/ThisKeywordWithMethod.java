package this_Keyword;

public class ThisKeywordWithMethod {
    public static void main(String[] args) {
        A a = new A();
        a.print();
    }
}

class A {
    public void display() {
        System.out.println("Inside display method");
    }

    public void print() {
        this.display();
        System.out.println("Inside print method");
    }
}
