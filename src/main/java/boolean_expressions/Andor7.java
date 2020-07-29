// @desc Which order are the **and** and the **or** evaluated?
package boolean_expressions;

public class Andor7 {
    public static boolean Andor7(boolean val1, boolean val2, boolean val3) {
        boolean result = val1 || val2 || val3;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Andor7(true, true, true));
        System.out.println(Andor7(true, true, false));
        System.out.println(Andor7(true, false, true));
        System.out.println(Andor7(true, false, false));
        System.out.println(Andor7(false, true, true));
        System.out.println(Andor7(false, true, false));
        System.out.println(Andor7(false, false, true));
        System.out.println(Andor7(false, false, false));
    }
}