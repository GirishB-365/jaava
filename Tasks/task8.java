import java.util.Scanner;
public class task8 {
    
    public static void swapNumbersWithoutTemp(int a, int b) {
        
        a = a + b;  
        b = a - b;  
        a = a - b;  

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

        swapNumbersWithoutTemp(a, b);

        scanner.close();
    }
}


