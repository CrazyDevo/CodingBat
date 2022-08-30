package warmup_1;

public class Or35 {
    /*
    Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod


or35(3) → true
or35(10) → true
or35(8) → false
     */

    public static void main(String[] args) {
      boolean result=  or35(3);
        System.out.println("result = " + result);
    }

    private static boolean or35(int n) {
        return n%3==0||n%5==0;
    }
}
