
public class Demo074 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3,6,9};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
     }
}
}
