import java.util.*;
import java.util.stream.*;
import java.lang.reflect.Array;

public class InefficientStack<T> {

    public static void main(String [] args) {
        System.out.printf("Hello Inefficient Stack Solution #1%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java InefficientStack%n");
            return;
        }

        InefficientStack<String> stack = new InefficientStack<String>(String.class);

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

    private Class<T> clazzzT;
    private T[] stack;
    private int count;
    private final static int STACK_CAPACITY = 2;

    public InefficientStack(Class<T> clazzz) {
        clazzzT = clazzz;
        @SuppressWarnings("unchecked")
        final T[] initStackArray = (T[]) Array.newInstance(clazzz, STACK_CAPACITY);
        this.stack = initStackArray;
        count = 0;
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
        return this.count == 0;
    }

    public void push(T value) {
        System.out.printf("%n%n");
        System.out.printf("push a value %s on the top of the stack%n", value.toString());
        System.out.printf("stack has %d values and %d length%n", count, this.stack.length);
        if (this.count >= this.stack.length) {
            System.out.printf("increase stack size by stack capacity %d%n", STACK_CAPACITY);
            @SuppressWarnings("unchecked")
            T[] temp = (T[]) Array.newInstance(clazzzT, this.count + STACK_CAPACITY);
            for (int i = 0; i < this.stack.length; i++) {
                temp[i] = this.stack[i];
            }
            this.stack = temp;
        }
        this.stack[count] = value;
        count++;
    }

    public T peek() {
        System.out.printf("%n%n");
        System.out.printf("peek a value on the top of the stack%n");
        if (this.stack == null || this.stack.length == 0) return null;
        return this.stack[count - 1];
    }

    public T pop() {
        System.out.printf("pop a value on the top of the stack%n");
        if (this.stack == null || this.stack.length == 0 || count == 0) return null;
        T value = this.stack[count - 1];
        this.stack[count - 1] = null;
        count--;
        return value;
    }

}
