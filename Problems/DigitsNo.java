import java.util.Scanner;
public class DigitsNo {


    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int n,rem,count=0;
        System.out.print("Enter no");
        n=r.nextInt();

        while(n>0){
            rem= n%10;
            count++;
            n=n/10;
        }
        System.out.print("No of digits:" + count);
    }
    
}
