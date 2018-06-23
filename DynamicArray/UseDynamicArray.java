package DynamicArray;

/**
 *
 * @author Dipty
 */
public class UseDynamicArray {

    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<Integer>();

        dynamicArray.put(2);
        System.out.println("size: " + dynamicArray.getSize());
        dynamicArray.put(5);
        System.out.println("size: " + dynamicArray.getSize());
        dynamicArray.put(10);
        System.out.println("size: " + dynamicArray.getSize());
        dynamicArray.put(12);
        System.out.println("size: " + dynamicArray.getSize());
    }

}
