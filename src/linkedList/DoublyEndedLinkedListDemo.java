package linkedList;

/**
 * @author Mohammed Amr
 * @created 21/02/2021 - 00:44
 * @project think-data-structures
 */
public class DoublyEndedLinkedListDemo {

    public static void main(String[] args) {

        DoublyEndedLinkedList dList = new DoublyEndedLinkedList();
        dList.insertAtTail(19);
        dList.insertAtTail(18);
        dList.insertAtTail(17);

        System.out.println(dList);

    }
}
