import java.util.Scanner;
public class task1 {
    public static void printOddNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value:");
        int n = scanner.nextInt();

        printOddNumbers(n);

    }
}
