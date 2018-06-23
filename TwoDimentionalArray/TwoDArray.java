package TwoDimentionalArray;

/**
 *
 * @author Dipty
 */
public class TwoDArray {

    public static void main(String[] args) {
        int[][] number = new int[3][3];
        number[0][0] = 10;
        number[0][1] = 20;
        number[0][2] = 0;
        number[1][0] = 5;
        number[1][1] = 30;
        number[1][2] = 50;
        number[2][0] = 15;
        number[2][1] = 35;
        number[2][2] = 11;
        
        for(int i = 0 ; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(number[i][j]+" ");
            }
            System.out.println("\n");
        }
        
         //arrayof objects
        UserDefined2DArray[][] myInfo = new UserDefined2DArray[3][3];
        myInfo[0][0] = new UserDefined2DArray("dipty",1);
        myInfo[0][1] = new UserDefined2DArray("shaila",2);
        myInfo[0][2] = new UserDefined2DArray("nasrin",3);
        myInfo[1][0] = new UserDefined2DArray("dip",20);
        myInfo[1][1] = new UserDefined2DArray("ty",10);
        myInfo[1][2] = new UserDefined2DArray("tylor",30);
        myInfo[2][0] = new UserDefined2DArray("di",5);
        myInfo[2][1] = new UserDefined2DArray("py",15);
        myInfo[2][2] = new UserDefined2DArray("jake",35);
        
         for(int i = 0 ; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("name: "+myInfo[i][j].name+" & id:"+myInfo[i][j].id);
            }
            //System.out.println("\n");
        }
    }

}
