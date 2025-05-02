import java.util.Scanner;
public class tsk7 {
    



    public static void swapNumbersUsingTemp(int a, int b) {
       
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        swapNumbersUsingTemp(a, b);

        scanner.close();
    }
}


