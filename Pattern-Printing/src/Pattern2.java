/*
Print the pattern
*
**
***
****
*****
*/

 class Pattern2 {
     int size = 5;

     {
         for (int i = 0; i < size; i++) {
             for (int j = 0; j < size; j++) {
                 if (i >= j) {
                     System.out.print("*");
                 }
             }
             System.out.println();
         }
     }
}