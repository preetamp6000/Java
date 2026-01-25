/*

* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *

*/
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No.: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}





//2

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No.: ");
        int n = sc.nextInt();

        String row = "* ".repeat(n);

        for (int i = 0; i < n; i++) {
            System.out.println(row);
        }
    }
}