package Stack;

/**
 *
 * @author Dipty
 */
public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(20);
        
        stack.push(10);
        stack.push(20);
        stack.push(70);
        
        //printing the top value
        System.out.println("peak: "+stack.peak());
        
        //printing all the values in the stack
        while(!stack.isEmpty())
        {
            long value = stack.pop();
            System.out.println(value);
        }
       // System.out.println(StackMain.reverseString("Dipty"));
    }
    
//    public static String reverseString(String str)
//    {
//        int stackSize = str.length();
//        Stack stack = new Stack(stackSize);
//        String s = "";
//        for(int i = 0;i < length;i++)
//        {
//            stack.push(str.charAt(i));
//        }
//       
//        while(!stack.isEmpty())
//        {
//            char value = stack.pop();
//            s+=value;
//        }
//        
//        return s;
//    }
}
