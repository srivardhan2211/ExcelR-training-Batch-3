public class Demo063 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int sum = array[0] + array[array.length - 1];
        System.out.println("\nSum of 1st and last element: " + sum);
    }
}