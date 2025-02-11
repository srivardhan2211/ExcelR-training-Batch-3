public class Demo070 {
    public static void main(String[] args) {
        int[] array = {10, 23, 30, 41, 50, 67, 80, 91};
        System.out.println("Prime numbers in the array:");
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
