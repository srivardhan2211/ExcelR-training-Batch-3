public class Demo067 {
    public static void main(String[] args) {
        int[] array = {10, 23, 30, 41, 50, 67, 80, 91};

        System.out.println("Even elements of the array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

