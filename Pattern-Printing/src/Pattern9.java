/*
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *

 */

public class Pattern9 {
    int size = 5, stars = 1,spaces = size - 1;
    {
    /* Iterate through rows */
        for(int i=1; i<size*2; i++) {
            /* Print spaces */
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            /* Print stars */
            for (int j = 1; j < stars * 2; j++) {
                System.out.print("*");
            }

            /* Move to next line */
            System.out.println(" ");

            if (i < size) {
                spaces--;
                stars++;
            } else {
                spaces++;
                stars--;
            }
        }

        //way2
//        int number =5;
//
//        int m, n;
//
//        // Outer loop 1
//        // prints the first half diamond
//        for (m = 1; m <= number; m++) {
//
//            // Inner loop 1 print whitespaces inbetween
//            for (n = 1; n <= number - m; n++) {
//                System.out.print(" ");
//            }
//
//            // Inner loop 2 prints star
//            for (n = 1; n <= m * 2 - 1; n++) {
//                System.out.print("*");
//            }
//
//            // Ending line after each row
//            System.out.println();
//        }
//
//        // Outer loop 2
//        // Prints the second half diamond
//        for (m = number - 1; m > 0; m--) {
//
//            // Inner loop 1 print whitespaces inbetween
//            for (n = 1; n <= number - m; n++) {
//                System.out.print(" ");
//            }
//
//            // Inner loop 2 print star
//            for (n = 1; n <= m * 2 - 1; n++) {
//                System.out.print("*");
//            }
//
//            // Ending line after each row
//            System.out.println();
//        }

    }
}
