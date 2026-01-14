//Area of Circle

import java.util.Scanner;

public class Area {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        int r=sc.nextInt();
        double area = 3.14 *r*r;
        System.out.println("Area of Circle   " + area);

    }
    
}


//Area of Rectangle

import java.util.Scanner;

class Rectangle{
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter l*b");
        int l=r.nextInt();
        int b=r.nextInt();
        
        System.out.println("Area of Rectangle: " + (l*b));
     }
}


//Area of Square

import java.util.Scanner;

class Square{
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter a Side");
        int s=r.nextInt();

        System.out.println("Area of Square: "+(s*s));
        
    }
}



