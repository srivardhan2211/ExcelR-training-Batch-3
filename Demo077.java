import java.util.Arrays;

public class Demo077 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray1 = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Copied Array 1: " + Arrays.toString(copiedArray1));
        int[] copiedArray2 = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray2[i] = originalArray[i];
        }
        System.out.println("Copied Array 2: " + Arrays.toString(copiedArray2));
        int[] copiedArray3 = new int[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray3, 0, originalArray.length);
    }
}
