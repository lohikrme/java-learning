// FixedStack.java
// 13th april 2024
import Interfaces.OpenStack;
import java.util.ArrayList;

public class FixedStack implements OpenStack {
    private ArrayList<Integer> stack = new ArrayList<Integer>();

    // empty constructor
    FixedStack() {}

    // implement methods of OpenStack interface
    public void push(int value) {
        stack.add(value);
    }

    public int pop() {
        if (stack.size() > 1) {
            return (stack.remove(stack.size() - 1));
        } 
        else {
            return -9999999;
        }
    }

    // assume method wants to read every item of stack
    public void ReadItem() {
        for (int i = stack.size() -1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
    
}
