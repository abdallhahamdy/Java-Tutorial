package LSP.AdherenceLSP;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.eat();   // Output: Sparrow is eating
        ((Sparrow) sparrow).fly();  // Output: Sparrow is flying

        Bird penguin = new Penguin();
        penguin.eat();   // Output: Penguin is eating
        ((Penguin) penguin).swim();   // Output: Penguin is swimming
    }
}
