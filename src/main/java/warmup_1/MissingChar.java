package warmup_1;

public class MissingChar {
    /*

Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).


missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
     */
    public static void main(String[] args) {
     String str=   missingChar("kitten", 0);
        System.out.println("str = " + str);
    }

    private static String missingChar(String word, int skip) {
        String result="";
        for (int i = 0; i < word.length(); i++) {
            if (i==skip)
                continue;
            result+=word.charAt(i);
        }
        return result;
    }
}
