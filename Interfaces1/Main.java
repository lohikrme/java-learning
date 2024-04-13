// Main.java
// 13th april 2024

public class Main {
    public static void main(String[] args) {
        FixedStack stack = new FixedStack();
        for (int i = 0; i <= 20; i++) {
            stack.push(i);
        }
        System.out.println("Stack after adding numbers 0-20:");
        stack.ReadItem();
        for (int i = 0; i < 5; i++) {
            System.out.println("Removing toppest value from stack: " + stack.pop());
        }
        System.out.println("Stack after removing 5 toppest items:");
        stack.ReadItem();
    }
}
