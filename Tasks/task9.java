import java.util.Scanner;
public class task9 {
   public static int sumOfNaturalNumbers(int n) {
       
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of the first " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}


