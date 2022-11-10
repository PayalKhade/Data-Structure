/*
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 */
public class Pattern18 {

    {
        int size = 5;
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int space = 1; space <= (size - i) * 2; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //after size=5
        for (int i = size-1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int space = 1; space <= (size - i) * 2; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
