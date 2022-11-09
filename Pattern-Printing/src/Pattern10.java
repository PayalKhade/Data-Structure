/*
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 */

public class Pattern10 {
    {   int size =5,star =1;
        for (int i = 1; i <= size*2; i++) {     //for rows
            for(int j=1;j<=star;j++){  //printing star
                System.out.print("*");
            }
            System.out.println();
            if(i<size)
                star++;
            else
                star--;

        }
    }
}
