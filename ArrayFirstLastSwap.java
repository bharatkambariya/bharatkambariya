import java.util.Arrays;

public class ArrayFirstLastSwap {
    public static void swapFirstAndLast(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500};

        swapFirstAndLast(numbers);

        System.out.println(Arrays.toString(numbers)); // [500, 200, 300, 400, 100]
    }
}
