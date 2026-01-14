// Swap Two Numbers

public class Swap {

    public static void main(String[] args) {
        int a=5,b=10;
        System.out.println("A:"+ a +" "+"B:" + b);
        int temp =a;
        a=b; 
        b=temp;
        
        System.out.println("A:"+ a +" "+"B:" + b);
        

    }
    
}


//Swaping no without using temp variable

Class Swap{
    public static void main(String[] args) {
        int a=50, b=60;
        System.out.println("A:"+ a +" "+"B:" + b);
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("A:"+ a +" "+"B:" + b);
    }
}
