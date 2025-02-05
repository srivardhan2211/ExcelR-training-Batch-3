
import java.util.Arrays;

public class Demo064 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));
        swapFirstAndLast(array);
        System.out.println("Array after swapping: " + Arrays.toString(array));
    }

    public static void swapFirstAndLast(int[] array) {
        if (array.length > 1) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
    }
}
