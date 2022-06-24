public class PrintNnumbers{
    public static void print1(int n)       //prints nto 1
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        print1(n-1);
    }
    public static void print2(int n)       //print 1 to n
    {
        if(n==0)
        {
            return;
        }
        print2(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.println("Numbers from n to 1 are");
        print1(6);
        System.out.println("Numbers from 1 to n are");
        print2(6);
    }
}
 