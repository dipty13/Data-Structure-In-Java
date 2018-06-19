package OneDimentionalArray;

/**
 *
 * @author Dipty
 */
public class OneDimentionalArrayImplementation {
    public static void main(String[] args)
    {
        int[] number = new int[5];
        
        number[0] = 15;
        number[1] = 10;
        number[2] = 20;
        number[3] = 30;
        number[4] = 40;
        
        for(int i=0 ; i < number.length ; i++)
        {
            System.out.println(number[i]);
        }
        
        //arrayof objects
        UserDefinedTypeOneDArray[] myInfo = new UserDefinedTypeOneDArray[5];
        myInfo[0] = new UserDefinedTypeOneDArray("dipty",1);
        myInfo[1] = new UserDefinedTypeOneDArray("shaila",2);
        myInfo[2] = new UserDefinedTypeOneDArray("nasrin",3);
        myInfo[3] = new UserDefinedTypeOneDArray("dip",20);
        myInfo[4] = new UserDefinedTypeOneDArray("ty",10);
        
        //one way to print
        for(int i=0 ; i < myInfo.length ; i++)
        {
            System.out.println("name: " + myInfo[i].name + ", id: " + myInfo[i].id);
        }
        
        //another way to print
        System.out.println("\nprinting array using for each");
        for(UserDefinedTypeOneDArray ua : myInfo)
        {
            System.out.println("name: " + ua.name + ", id: " + ua.id);
        }
        
        
        
    }
    
}
