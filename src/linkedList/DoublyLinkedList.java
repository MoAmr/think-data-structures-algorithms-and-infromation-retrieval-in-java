package linkedList;

/**
 * @author Mohammed Amr
 * @created 21/02/2021 - 01:50
 * @project think-data-structures
 */
public class DoublyLinkedList {

    private DoublyLinkedNode head;

    public void insertAtHead(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);

        if (this.head != null) {
            this.head.setPreviousNode(newNode);
        }
        this.head = newNode;
    }

    public int length() {
        int length = 0;
        DoublyLinkedNode current = this.head;
        while (current != null) {
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    @Override
    public String toString() {
        String result = "{";
        DoublyLinkedNode current = this.head;

        while (current != null) {
            result += current.toString() + ", ";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
