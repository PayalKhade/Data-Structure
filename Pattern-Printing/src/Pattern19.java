/*
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

*/
public class Pattern19 {

    {
        int n = 4, i, j, min;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                min = i < j ? i : j;
                System.out.print(n - min + 1+ " ");
            }
            //loop for upper right part
            for (j = n - 1; j >= 1; j--)
            {
                min = i < j ? i : j;
                System.out.print(n - min + 1+ " ");
            }
            System.out.println();
        }
        //loop for lower left part

        for (i = n - 1; i >= 1; i--)
        {
            for (j = 1; j <= n; j++)
            {
                min = i < j ? i : j;
                System.out.print(n - min + 1+ " ");
            }
            //loop for lower right part
            for (j = n - 1; j >= 1; j--)
            {
                min = i < j ? i : j;
                System.out.print(n - min + 1+ " ");
            }
            System.out.println();
        }

    }
}
