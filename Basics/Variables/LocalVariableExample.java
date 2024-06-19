public class LocalVariableExample {
    public void calculateSum() {
        int sum = 0; // local variable
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
    }

    public static void main(String[] args) {
        LocalVariableExample example = new LocalVariableExample();
        example.calculateSum();
    }
}
