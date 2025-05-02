import java.util.Scanner;
public class task11 {
     public static int calculateCube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int cube = calculateCube(n);
        System.out.println("The cube of " + n + " is: " + cube);

        scanner.close();
    }
}
