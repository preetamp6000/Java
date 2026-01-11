//Odd No in Range
import java.util.Scanner;
public class OddNo {
    public static void main(String[] args)
     {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a No");
        int n=obj.nextInt();

        for(int i=1; i<=n; i++)
            {
            if(i % 2 !=0){
                System.out.println(i);
            }
            
        }
    }
    
}
