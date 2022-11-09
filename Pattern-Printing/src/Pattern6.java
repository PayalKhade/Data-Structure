/*
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
 */
public class Pattern6 {
    int size = 5;

        {
            for (int i=0;i<size;i++)
            {   for (int j=1;j<=(size-i);j++)
            {
                {
                    System.out.print(j+" ");
                }
            }
                System.out.println();
            }
        }

}
