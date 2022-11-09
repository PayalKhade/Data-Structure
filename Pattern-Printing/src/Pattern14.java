/*
A
AB
ABC
ABCD
ABCDE
*/
public class Pattern14 {
    {
        int n =5;
        // char ch = 65;

        // for (int i = 1; i <= n ; i++) {

        //     for (int j = ch; j <= ch+i-1 ; j++) {

        //         System.out.print(Character.toChars(j));

        //     }

        //     System.out.println();
        // way 2
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i; j++) {

                char c=(char) (64+j);

                System.out.print(c);

            }
            System.out.println();
        }
    }
}
