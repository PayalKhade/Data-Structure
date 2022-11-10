/*
A
BB
CCC
DDDD
EEEEE
 */
public class Pattern16 {
    {
        int size =5;
        for (int i =1;i<=size;i++)
        {
            for(int j=1;j<=i;j++)
            {
                char c=(char) (64+i);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
