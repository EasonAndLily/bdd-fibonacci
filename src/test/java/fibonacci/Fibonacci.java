package fibonacci;

public class Fibonacci {
    public static int getValue(int index) {
        if (index < 2) {
            return index;
        }
        return getValue(index - 1) + getValue(index - 2);
    }
}
