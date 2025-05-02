import java.util.Scanner;
public class task5 {
    



    public static double calculateCompoundInterest(double principal, double rate, int time) {
        double amount = principal * Math.pow(1 + rate / 100, time);
        return amount - principal;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        int time = scanner.nextInt();

        double interest = calculateCompoundInterest(principal, rate, time);
        System.out.printf("Compound Interest: %.2f\n", interest);
        
        scanner.close();
    }
}


