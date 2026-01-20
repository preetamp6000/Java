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


//Base and Hight


import java.util.Scanner;

public class AreaBaseHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area = " + area);
    }
}
