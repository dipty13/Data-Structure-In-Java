package SinglyLinkedList;
/**
 *@author Dipty
 * 
 */
public class Node {
    /**
     * every node in linked list has two things
     * 1. value
     * 2. pointer for next element
     */
    Object value; //Object type so that we can use this for any data types
    Node next;

    public Node(Object value,Node next) {
        this.value = value;
        this.next = next;
    }
    
}
