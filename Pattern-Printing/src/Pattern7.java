/*
     *
    ***
   *****
  *******
 *********
 */

public class Pattern7 {
    int size = 5;

    {
        for (int i = 1; i <= size; i++) {     //for r ows
            for (int space = 1; space <= (size - i); space++) {  // for space
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {    //for column star printing
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
