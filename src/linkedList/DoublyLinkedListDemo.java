package linkedList;

/**
 * @author Mohammed Amr
 * @created 21/02/2021 - 01:56
 * @project think-data-structures
 */
public class DoublyLinkedListDemo {

    public static void main(String[] args) {

        DoublyLinkedList integers = new DoublyLinkedList();

        integers.insertAtHead(5);
        integers.insertAtHead(6);
        integers.insertAtHead(7);
        integers.insertAtHead(8);
        integers.insertAtHead(9);
        integers.insertAtHead(10);
        integers.insertAtHead(11);

        System.out.println(integers);
    }
}
