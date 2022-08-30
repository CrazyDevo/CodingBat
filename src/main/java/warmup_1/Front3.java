package warmup_1;

public class Front3 {

    /*
    Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
     */
    public static void main(String[] args) {
       String str= front3("Java");
        System.out.println("str = " + str);
    }

    private static String front3(String word) {
        if (word.length()<3)
            return word.substring(0)+word.substring(0)+word.substring(0);
        return word.substring(0,3)+word.substring(0,3)+word.substring(0,3);
    }
}
