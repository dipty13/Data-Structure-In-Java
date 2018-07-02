package Stack;

/**
 *
 * @author Dipty
 */
public class Stack {

    private int size;
    private long[] stackArray;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.stackArray = new long[size];
        this.top = -1;
    }

    public void push(long value) {
        if (isFull()) {
            System.out.println("This stack is already full! So, can't push the value " + value);
        } else {
            top++;
            stackArray[top] = value;
        }
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("This stack is already empty!");
            return -1;
        } else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }

    public long peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }
}
