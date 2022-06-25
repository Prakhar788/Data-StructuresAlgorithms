public class String {
    public static void main(String[] args) {
        skip("","nccacd" );
    }
    static void skip(String a,String b){
        if(b.isEmpty()){
            System.out.println(a);
            return;
        }
        char ch=b.charAt(0);
        if(ch=='a'){
            skip(a, b.substring(1));
        }
        else{
            skip(a+ch, b.substring(1));
        }
    }
}
