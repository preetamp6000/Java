import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {
        
        int n;
        System.out.println("Enter code of day");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        switch(n)
        {
            case 0:System.out.println("Sunday");
            break;

            case 1:System.out.println("Monday");
            break;

            case 2:System.out.println("Tuesday");
            break;

            case 3:System.out.println("Wednesday");
            break;

            case 4:System.out.println("Thrusday");
            break;

            case 5:System.out.println("Friday");
            break;

            case 6:System.out.println("Satuday");
            break;

            default:System.out.println("Invalid Code");
            break;
        }
    }
}
