public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(30408));
    }
    static int count(int n)
    {
        return func2(n,0);
    }

    private static int func2(int n,int c) {
        if(n==0)
        {
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return func2(n/10,c+1);
        }
        return func2(n/10, c);
    }
    
}
