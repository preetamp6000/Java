import java.util.Scanner;

public class PowerofNum {
    public static void main(String[] args) {
        
        
        int n,p, result=1;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter a number");
        n=r.nextInt();
        System.out.println("Enter power");
        p=r.nextInt();

        for(int i=1; i<=p; i++){
            result = result*n;
        }
        System.out.println("Result" +  result);


    }
    
}
