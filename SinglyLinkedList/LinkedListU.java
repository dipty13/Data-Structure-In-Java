package SinglyLinkedList;

/**
 *
 * @author Dipty
 */
public class LinkedListU<T> {
    //it stroes the address of the first node
    Node head;//the root node

    public LinkedListU() {
        //initially the list is empty so there is no address
        head = null;
    }
    
    //Adding value to the beginning 
    public void insertInBeginning(Object value)
    {
        //to add value we have to create new node
        Node newNode = new Node(value,null);
        
        //when there is no node
        if(head==null)
        {
            head = newNode;
        }else{
            newNode.next = head; 
            head = newNode;
        }
    }
    
    //delete first element
    public void delete()
    {
        head = head.next;
        
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
        Node newNode = new Node(value,null);
        Node current = head;
        //last node's pointer will be null
        while(current.next!=null)
        {
            current = current.next;
        }
        current.next = newNode;
    }
}
