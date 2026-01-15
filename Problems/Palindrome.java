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
