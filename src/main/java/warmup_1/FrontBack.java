package warmup_1;

public class FrontBack {

    /*
    Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

     */
    public static void main(String[] args) {
        String str = frontBack("a");
        System.out.println("str = " + str);
    }

    private static String frontBack(String str) {
        if (str.length()==1)
            return str;
        char last = str.charAt(0);
        char first = str.charAt(str.length()-1);
        String result="";
        result+=first;
        for (int i = 1; i < str.length()-1; i++) {
            result+=str.charAt(i);
        }
        result+=last;
        return result;
    }
}
