import java.util.*;
import java.util.stream.*;

public class EfficientStack<T> {

    public static void main(String [] args) {
        System.out.printf("Hello Efficient Stack Solution #1%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java EfficientStack%n");
            return;
        }

        EfficientStack<String> stack = new EfficientStack<>();

        // initial state
        stack.emptinessMessage(stack.isEmpty());

        stack.push("a");
        stack.emptinessMessage(stack.isEmpty());

        stack.push("b");
        stack.emptinessMessage(stack.isEmpty());

        stack.push("c");
        stack.emptinessMessage(stack.isEmpty());

        stack.push("d");
        stack.emptinessMessage(stack.isEmpty());

        String peekValue = stack.peek();
        stack.valueMessage(peekValue);

        String popValue = stack.pop();
        stack.valueMessage(popValue);
        stack.emptinessMessage(stack.isEmpty());

        popValue = stack.pop();
        stack.valueMessage(popValue);
        stack.emptinessMessage(stack.isEmpty());

        popValue = stack.pop();
        stack.valueMessage(popValue);
        stack.emptinessMessage(stack.isEmpty());

        popValue = stack.pop();
        stack.valueMessage(popValue);
        stack.emptinessMessage(stack.isEmpty());

        popValue = stack.pop();
        stack.valueMessage(popValue);
        stack.emptinessMessage(stack.isEmpty());

    }

    private SinglyLinkedList<T> singlyLinkedList;

    public EfficientStack() {
        this.singlyLinkedList = new SinglyLinkedList<>();
    }

    private void emptinessMessage(boolean isStackEmpty) {
        if (isStackEmpty) { 
            System.out.printf("stack is empty%n");
        }
    }

    private void valueMessage(T value) {
        if (value == null) {
            System.out.printf("the value is null%n");
        } else {
            System.out.printf("the value is %s%n", value.toString());
        }
    }

    public boolean isEmpty() {
        return singlyLinkedList.isEmpty();
    }

    public void push(T value) {
        System.out.printf("%n%n");
        System.out.printf("push the value %s on the top of the stack%n", value.toString());
        singlyLinkedList.add(value);
    }

    public T peek() {
        System.out.printf("%n%n");
        System.out.printf("peek the value on the top of the stack%n");
        return singlyLinkedList.read();
    }

    public T pop() {
        System.out.printf("%n");
        System.out.printf("pop the value on the top of the stack%n");
        return singlyLinkedList.remove();
    }

}
