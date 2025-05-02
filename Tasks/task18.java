import java.util.Scanner;
public class task18 {
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Fibonacci terms: ");
        int n = scanner.nextInt();

        generateFibonacci(n);
        scanner.close();
    }
}


