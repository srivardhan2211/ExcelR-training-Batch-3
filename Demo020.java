public class Demo020 {
    public static void main(String[] args) {
        int num = 2;
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " + " + num + " = " + (num + num));
            num = num + num;
        }
    }
}