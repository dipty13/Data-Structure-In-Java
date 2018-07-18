package DoublyLinkedList;
/**
 *
 * @author Dipty
 */
public class Main {
    public static void main(String[] args) {
        LinkedListD<String> list = new LinkedListD<>();
        
        list.insertInBeginning("dipty");
        list.insertInBeginning("nasrin");
        list.insertInBeginning("shaila");
        list.insertAtLast("MyNameop");
        
        list.display();
        list.delete();
        list.display();
    }
}
