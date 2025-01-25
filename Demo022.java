import java.util.Scanner;

public class Demo022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly gross salary: ");
        double monthlyGrossSalary = scanner.nextDouble();

        System.out.print("Enter monthly HRA: ");
        double monthlyHRA = scanner.nextDouble();

        System.out.print("Enter monthly PF: ");
        double monthlyPF = scanner.nextDouble();

        double annualGrossSalary = monthlyGrossSalary * 12;
        double annualHRA = monthlyHRA * 12;
        double annualPF = monthlyPF * 12;

        double deductions = annualHRA + annualPF;
        double taxableIncome = annualGrossSalary - deductions;

        double tax = calculateTax(taxableIncome);

        System.out.println("Annual Gross Salary: " + annualGrossSalary);
        System.out.println("Deductions: " + deductions);
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Total Tax: " + tax);
    }

    public static double calculateTax(double taxableIncome) {
        double tax = 0;

        if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 1000000) {
            tax = 500000 * 0.10 + (taxableIncome - 500000) * 0.20;
        } else {
            tax = 500000 * 0.10 + 500000 * 0.20 + (taxableIncome - 1000000) * 0.30;
}

        return tax;
    }
}
