
public class Demo062 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n1st element: " + array[0]);
        System.out.println("2nd element: " + array[1]);
        System.out.println("Last element: " + array[array.length - 1]);
    }
}
