public class LTcode003 {
    public int reverse(int x) {
        long reversed = 0; 
        int sign = x < 0 ? -1 : 1;
        x *= sign;

        while (x > 0) {
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }

        if (reversed > Integer.MAX_VALUE) { 
            return 0;
        }

        return (int) reversed * sign;
    }

    public static void main(String[] args) {
        LTcode003 solution = new LTcode003();
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
    }
}