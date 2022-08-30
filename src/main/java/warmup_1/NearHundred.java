package warmup_1;

public class NearHundred {
    /*

Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
     */
    public static void main(String[] args) {
       boolean result= nearHundred(93);
        System.out.println("result = " + result);
    }

    private static boolean nearHundred(int n) {
        return Math.abs(n-100)<=10 || Math.abs(n-200)<=10;
    }
}
