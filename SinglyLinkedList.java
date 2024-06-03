public class SinglyLinkedList<T> {

    public static void main(String [] args) {

        System.out.printf("Hello Singly Linked List Solution #1%n");

        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java SinglyLinkedList%n");
            return;
        }

        SinglyLinkedList<String> linkedList = new SinglyLinkedList<String>();

        // initial state
        System.out.printf("initial state%n");
        linkedList.emptinessMessage(linkedList.isEmpty());
        String addValue = linkedList.read();
        linkedList.valueMessage(addValue);

        System.out.printf("%n");
        System.out.printf("add a%n");
        linkedList.add("a");
        addValue = linkedList.read();
        linkedList.valueMessage(addValue);
        linkedList.emptinessMessage(linkedList.isEmpty());

        System.out.printf("%n");
        System.out.printf("add b%n");
        linkedList.add("b");
        addValue = linkedList.read();
        linkedList.valueMessage(addValue);
        linkedList.emptinessMessage(linkedList.isEmpty());

        System.out.printf("%n");
        System.out.printf("add c%n");
        linkedList.add("c");
        addValue = linkedList.read();
        linkedList.valueMessage(addValue);
        linkedList.emptinessMessage(linkedList.isEmpty());

        System.out.printf("%n");
        System.out.printf("add d%n");
        linkedList.add("d");
        addValue = linkedList.read();
        linkedList.valueMessage(addValue);
        linkedList.emptinessMessage(linkedList.isEmpty());

        System.out.printf("%n");
        System.out.printf("remove top expect d%n");
        String popValue = linkedList.remove();
        linkedList.valueMessage(popValue);
        linkedList.emptinessMessage(linkedList.isEmpty());

        System.out.printf("%n");
        System.out.printf("remove top expect c%n");
        popValue = linkedList.remove();
        linkedList.valueMessage(popValue);
        linkedList.emptinessMessage(linkedList.isEmpty());

        System.out.printf("%n");
        System.out.printf("remove top expect b%n");
        popValue = linkedList.remove();
        linkedList.valueMessage(popValue);
        linkedList.emptinessMessage(linkedList.isEmpty());

        System.out.printf("%n");
        System.out.printf("remove top expect a%n");
        popValue = linkedList.remove();
        linkedList.valueMessage(popValue);
        linkedList.emptinessMessage(linkedList.isEmpty());

        System.out.printf("%n");
        System.out.printf("remove top expect null%n");
        popValue = linkedList.remove();
        linkedList.valueMessage(popValue);
        linkedList.emptinessMessage(linkedList.isEmpty());

    }

    private Node<T> top;
    private Node<T> NIL = new Node<>(null, null);

    public SinglyLinkedList() {
        top = NIL;
    }

    public boolean isEmpty() {
        return top == NIL;
    }

    public void add(T value) {
        Node<T> previous= top;
        top = new Node<T>(value, previous);
    }

    public T read() {
        return top.getValue();
    }

    public T remove() {
        System.out.printf("method remove()%n");
        System.out.printf("check is singly linked list is empty%n");
        if (isEmpty()) {
            System.out.printf("top is NIL%n");
            return null;
        } else {
            System.out.printf("top is not NIL%n");
        }
        System.out.printf("old value of top is %s%n", top.getValue());
        T poppedValue = top.getValue();
        Node<T> previous= top.getPreviousNode();
        Node<T> temp = top;
        temp.release();
        temp = null;
        System.out.printf("top is assigned previous node%n");
        top = previous;
        System.out.printf("new value of top is %s%n", top.getValue());
        return poppedValue;
    }

    private void emptinessMessage(boolean isLinkedListEmpty) {
        if (isLinkedListEmpty) { 
            System.out.printf("linked list is empty%n");
        } else {
            System.out.printf("linked list is not empty%n");
        }
    }

    private void valueMessage(T value) {
        if (value == null) {
            System.out.printf("the top value is null%n");
        } else {
            System.out.printf("the top value is %s%n", value.toString());
        }
    }

}
