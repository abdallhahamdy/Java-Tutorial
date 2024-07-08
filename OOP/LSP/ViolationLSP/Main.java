package LSP.ViolationLSP;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.fly();     // Output: Sparrow is flying

        bird = new Penguin();
        bird.fly();   // Throws UnsupportedOperationException
    }
}
