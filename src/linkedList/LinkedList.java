package linkedList;

/**
 * @author Mohammed Amr
 * @created 20/02/2021 - 21:58
 * @project think-data-structures
 */
public class LinkedList {

    private Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;
        while (current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }

        result += "}";
        return result;
    }

}
