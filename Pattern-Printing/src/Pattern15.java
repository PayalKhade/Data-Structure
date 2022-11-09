/*
ABCDE
ABCD
ABC
AB
A
 */
public class Pattern15
{  int size =5;
    {
        for (int i =size;i>=1;i--)
            {
              for(int j=1;j<=i;j++)
              {
                  char c=(char) (64+j);
                  System.out.print(c);
              }
              System.out.println();
            }
        }
}
