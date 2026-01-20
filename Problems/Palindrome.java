import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        int n,s=0,c,r;
        System.out.println("Enter a number");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        c=n;

        while (n>0) {

            r=n%10;
            s=s*10+r;
            n=n/10;
            
        }
        if(c==s){
            System.out.println("Palindrome No");
        }
        else{
            System.out.println("Not a Palindrome No");
        }
    }
    
}




//Second Way


import java.util.Scanner;

public class PalindromeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        int div = 1;
        while (temp / div >= 10) {
            div *= 10;
        }

        boolean isPalindrome = true;

        while (n != 0) {
            int first = n / div;
            int last = n % 10;

            if (first != last) {
                isPalindrome = false;
                break;
            }

            n = (n % div) / 10;
            div /= 100;
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}
