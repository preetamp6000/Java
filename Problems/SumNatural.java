// public class SumNatural {
//     public static void main(String args[])
//     {
//         for(int i=1; i<=10; i++){
//             System.out.println(i);
//         }

        
//     }
// }


// public class SumNatural {
//     public static void main(String args[])
//     {
//         int sum=0;
//         for(int i=1; i<=10; i++){
//             sum= sum+i;
//         }
//         System.out.println(sum);

        
//     }
// }

import java.util.Scanner;

public class SumNatural {
    public static void main(String args[])
    {
        int sum=0,n;
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter Range");
        n= obj.nextInt();
        for(int i=1; i<=n; i++){
            sum= sum+i;
        }
        System.out.println(sum);

        
    }
}