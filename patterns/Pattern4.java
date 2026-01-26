/*

******
 *****
  ****
   ***
    **
     *
*/


import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No.: ");
        int n = sc.nextInt();
        int sp=0, st=n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=st; k++){
                System.out.print("*");
            }
            System.out.println("");
            sp++;
            st--;
        }
    }
}
