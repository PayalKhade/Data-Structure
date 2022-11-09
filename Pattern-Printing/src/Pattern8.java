/*
*********
 *******
  *****
   ***
    *
 */

public class Pattern8 {
    {   int size =5;
        for (int i = 1; i <= size; i++) {     //for rows
            for (int space = 1; space <= (i -1);space++) {  // for space
                System.out.print(" ");
            }
            for (int j =1;j<=(size*2- (i*2-1)); j++) {  //for column star printing
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
