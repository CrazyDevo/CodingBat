package warmup_1;

public class StartHi {
    /*
    Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
     */

    public static void main(String[] args) {
        boolean result = startHi("hello hi");
        System.out.println("result = " + result);
    }

    private static boolean startHi(String str) {
        return str.startsWith("hi");
    }
}
