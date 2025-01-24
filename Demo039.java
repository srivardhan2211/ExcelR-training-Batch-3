import java.util.Scanner;

public class Demo039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);
        scanner.close();

        if (Character.isLowerCase(c)) {
            System.out.println(c + " is a lowercase letter.");
        } else if (Character.isUpperCase(c)) {
            System.out.println(c + " is an uppercase letter.");
        } else if (Character.isDigit(c)) {
            System.out.println(c + " is a digit.");
        } else {
            System.out.println(c + " is a special character.");
        }
    }
}
