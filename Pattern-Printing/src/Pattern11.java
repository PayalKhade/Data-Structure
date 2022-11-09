/*1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */

public class Pattern11 {
    {   int size =5;
        for (int i = 1; i <= size; i++) {     //for rows
            for(int j=1;j<=i;j++){  //printing number
                if((i+j)%2 == 0)
                {System.out.print("1 ");}
                else
                {System.out.print("0 ");}
            }
            System.out.println();
        }
    }
}
