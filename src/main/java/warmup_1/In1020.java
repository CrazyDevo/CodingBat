package warmup_1;

public class In1020 {
/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
 */
    public static void main(String[] args) {
      boolean result=  in1020(12, 99);
        System.out.println("result = " + result);
    }

    private static boolean in1020(int a, int b) {
        return (a>=10&&a<=20)||(b>=10&&b<=20);
    }
}
