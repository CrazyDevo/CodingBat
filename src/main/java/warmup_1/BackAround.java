package warmup_1;

public class BackAround {
    /*
    Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"

     */
    public static void main(String[] args) {
      String str=  backAround("cat");
        System.out.println("str = " + str);
    }

    private static String backAround(String str) {
        char c = str.charAt(str.length() - 1);
        return c+str+c;

    }
}
