import java.util.Scanner;

public class AreaofTriangle {

    public static void main(String[] args) {

        int a,b,c,sp,area;
        System.out.println("Enter side of Triangle");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();

        sp=(a+b+c)/2;

        area=Math.sqrt(sp* (sp-a)*(sp-b)*(sp-c));
        System.out.println("Area of Triangle");


        
         
    }
    
}
