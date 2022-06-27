public class PermutationsOfString {
    static void per(String ans, String str) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return ;
        }
        
        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i);
            per(f + ch + s, str.substring(1));
        }
        
    }

    public static void main(String[] args) {
        String str="abc";
        per(new String(),str);
    }
}