public class Demo019 {
    public static void main(String[] args) {
        int number = 42; // Example number

        int roundedNumber = roundToNearestFive(number);

        System.out.println("The number " + number + " rounded to the nearest 5 is " + roundedNumber + ".");
    }

    public static int roundToNearestFive(int num) {
        return (int) (Math.round(num / 5.0) * 5);
    }
}
