package SinglyLinkedList;

/**
 *@author Dipty
 * Difference between array and linked list is
 * LinekdList size can be increased.
 * LinekdList size can be increased.
 * We can insert data in any place of the list.
 * We can delete data from any place of the list.
 * Time complexity:
 *              search-> O(n)
 *              insert-> O(n)
 *              delete-> O(n)
 *              delete-> O(n)
 */
public class Main {
    public static void main(String[] args) {
        LinkedListU<String> list = new LinkedListU<>();
        
        list.insertInBeginning("dipty");
        list.insertInBeginning("nasrin");
        list.insertInBeginning("shaila");
        list.insertAtLast("MyName");
        
        list.display();
        list.delete();
        list.display();
    }
}
