package DoublyLinkedList;

/**
 *
 * @author Dipty
 */
public class LinkedListD<T> {
    //it stroes the address of the first node
    Node head;//the root node

    public LinkedListD() {
        //initially the list is empty so there is no address
        head = null;
    }
    
    //Adding value to the beginning 
    public void insertInBeginning(Object value)
    {
        //to add value we have to create new node
        Node newNode = new Node(value,null,null);
        
        //when there is no node
        if(head==null)
        {
            head = newNode;
        }else{
            newNode.next = head; 
            head.previous = newNode;
            head = newNode;
        }
    }
    
    //delete first element
    public void delete()
    {
        head = head.next;
        head.previous = null;
        
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
    
    public void insertAtLast(Object value)
    {
        Node newNode = new Node(value,null,null);
        Node current = head;
        //last node's pointer will be null
        while(current.next!=null)
        {
            current = current.next;
        }
        newNode.previous = current;
        current.next = newNode;
    }
    
}
