public class LTcode002 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0; 

        int sign = 1; 
        int index = 0;

        // check for sign
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        long result = 0; 
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index++) - '0');
            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int) result * sign;
    }

    public static void main(String[] args) {
        LTcode002 solution = new LTcode002();
        System.out.println(solution.myAtoi("42")); 
        System.out.println(solution.myAtoi(" -042")); 
        System.out.println(solution.myAtoi("1337c0d3")); 
        System.out.println(solution.myAtoi("0-1")); 
        System.out.println(solution.myAtoi("words and 987")); 
    }
}
