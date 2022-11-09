/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */



public class Pattern4 {
    int size = 5;
    {
        for(int i=1;i<=size;i++)
            {   for (int j=1;j<=size;j++)
                {   if(i>=j)
                    {
                        System.out.print(i+" ");
                    }
                }
                System.out.println();
            }
    }
}
