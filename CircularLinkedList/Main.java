package CircularLinkedList;

/**
 *
 * @author Dipty
 */
public class Main {
    public static void main(String[] args) {
        LinkedListC<String> list = new LinkedListC<>();
        
        list.insertFirst("dipty");
        list.insertFirst("nasrin");
        list.insertFirst("shaila");
        list.insertLast("MyNameop");
        
        list.display();
        list.deleteFirst();
        list.display();
        
    }
    
}
