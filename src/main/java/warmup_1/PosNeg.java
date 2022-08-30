package warmup_1;

public class PosNeg {

    /*

Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.


posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, 5, true) → true

     */
    public static void main(String[] args) {
     boolean result=   posNeg(-4, 5, false);
        System.out.println("result = " + result);
    }

    private static boolean posNeg(int a, int b, boolean isNegative) {

  if (isNegative){
      return a<0&&b<0;
  }else {
      return a*b<0;
  }



    }
}
