Local Variable
class demo
{
    int a=10;
    public static void main(String []args)
    {
        int a=10;
        System.out.println(a);

    }
}


Instance Variable
class demo
{
    int a=10;
    public static void main(String []args)
    {
        demo obj=new demo();
        System.out.println(obj.a);

    }
} 


class demo{
    static int x = 20;
    public static void main(String args[])
    {
        
        System.out.println(x);

    }
}
