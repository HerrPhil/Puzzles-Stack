public class Node<T> {

    public static void main(String [] args) {

        Node<String> NIL = new Node<>(null, null);
        Node<String> node = new Node<>("abc", NIL);

        System.out.printf("node value is %s%n", node.getValue());

        @SuppressWarnings("unchecked")
        Node<String> previous = node.getPreviousNode();

        if (previous == null) {
            System.out.printf("previous is null%n");
        } else if (previous == NIL) {
            System.out.printf("previous is NIL%n");
        } else { 
            System.out.printf("previous is not NIL%n");
        }

        String checkValue = node.getValue();
        System.out.printf("check value is %s%n", checkValue);
        System.out.printf("release node%n");

        node.release();

        if (node.getValue() == null) {
            System.out.printf("node value is null%n");
        } else {
            System.out.printf("node value is not null%n");
        }

        previous = node.getPreviousNode();

        if (previous == null) {
            System.out.printf("previous is null%n");
        } else if (previous == NIL) {
            System.out.printf("previous is NIL%n");
        } else {
            System.out.printf("previous is not NIL%n");
        }
    }

    private T value;
    private Node<T> previousNode;

    public Node(T value, Node<T> previousNode) {
        this.value = value;
        this.previousNode = previousNode;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getPreviousNode() {
        return previousNode;
    }

    public void release() {
        this.value = null;
        this.previousNode = null;
    }

}
