public class Demo068 {
    public static void main(String[] args) {
        int[] array = {10, 23, 30, 41, 50, 67, 80, 91};

        int evenCount = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Count of even numbers in the array: " + evenCount);
    }
}

