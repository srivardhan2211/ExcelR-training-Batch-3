import java.util.HashSet;
import java.util.Scanner;

public class Demo031 {
    public static void main(String[] args) {
        HashSet<Object> students = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        students.add(name);

        System.out.print("Enter student's roll number: ");
        int rollNumber = scanner.nextInt();
        students.add(rollNumber);

        System.out.print("Enter student's address: ");
        scanner.nextLine();
        String address = scanner.nextLine();
        students.add(address);

        scanner.close();

        System.out.println("Student Information:");
        for (Object student : students) {
            if (student instanceof String) {
                if (((String) student).matches("[a-zA-Z ]+")) {
                    System.out.println("Name: " + student);
                } else {
                    System.out.println("Address: " + student);
                }
            } else if (student instanceof Integer) {
                System.out.println("Roll Number: " + student);
            }
        }
    }
}