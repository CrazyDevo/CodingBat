package warmup_1;

public class SleepIn {

    /*

The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
     */
    public static void main(String[] args) {
      boolean result=  sleepIn(false, true);
        System.out.println("result = " + result);
    }

    private static boolean sleepIn(boolean weekday, boolean onVacation) {
        return !weekday||onVacation;

    }
}
