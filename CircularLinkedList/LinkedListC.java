package CircularLinkedList;

/**
 *
 * @author Dipty
 * @param <T>
 */
public class LinkedListC<T> {
    Node head;
    Node tail;

    public LinkedListC() {
        head = null;
        tail = null;
    }
    
    public void insertFirst(Object value)
    {
         Node newNode = new Node(value,null);
         if(head==null)
        {
            head = newNode;
            tail = newNode;
        }else{
              newNode.next = head; 
              head = newNode;
         }
    }
    public void insertLast(Object value)
    {
        Node newNode = new Node(value,null);
         if(head==null)
        {
            tail = newNode;
        }else{
             tail.next = newNode; //next value of the last node will point to new node
             tail = newNode; //we make new node the last node in the list
         }
    }
    
     public void deleteFirst()
    {
        if(head == null)
        {
            tail = null;
        }
        head = head.next;//first wiil point to old next value
    }
    public void display()
    {
        //we'll start iteration from root node pointer
        Node n = head;
        //last pointer will be null
        while(n!=null)
        {
            System.out.print((T)n.value+" ");
            n = n.next;
        }
        System.out.println("");
    }
}
