public class SubSeqAscii {
    public static void main(String[] args) {
        sub("", "abc");
    }
    static void sub(String a,String b){
        if(b.isEmpty()){
            System.out.println(a);
            return;
        }
        char cha=b.charAt(0);
         sub(a+cha, b.substring(1));
         sub(a,b.substring(1));
         sub(a+(cha+0), b.substring(1));

    }
}