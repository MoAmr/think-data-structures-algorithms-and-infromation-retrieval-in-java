package linkedList;

/**
 * @author Mohammed Amr
 * @created 20/02/2021 - 23:41
 * @project think-data-structures
 */
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);

        System.out.println(list);
        System.out.println("Size = " + list.length());
        
        list.deleteFromHead();

        System.out.println(list);
        System.out.println("Size = " + list.length());

        System.out.println("Found: " + list.find(12));
        System.out.println("Found: " + list.find(15));
    }
}
