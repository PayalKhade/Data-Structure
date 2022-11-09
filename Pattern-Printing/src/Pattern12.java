/*
1        1
12      21
123    321
1234  4321
1234554321
*/
public class Pattern12 {
    {
        int size =5,i,j,k; int n=size;
        for (i = 1; i <= size; i++){
            for( j=1;j<=i;j++){  //printing number
                {System.out.print(j);}
            }
//                for( k=j;k<=n;k++)
//                {
//                    System.out.print(" ");
//                }
//                for( k=n;k>=j;k--)
//                {
//                    System.out.print(" ");
//                }
            for(int space =1; space<=2*(size-i);space ++)
            {
                System.out.print(" ");
            }
            for( j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //way2
//        int i,j,k;  int c = 1;
//        for (i = 1; i <= n; i++){
//
//            for( j=1;j<=2*n;j++)
//
//            {
//
//                if(j<=i) System.out.print(c++ + " ");
//
//                else if(j>2*n-i) System.out.print(--c+" ");
//
//                else System.out.print("  ");
//
//            }
//
//            System.out.println();
//        }
}

