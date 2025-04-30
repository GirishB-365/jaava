
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int product = 1;
        int temp = Math.abs(number); 

        if (temp == 0) {
            product = 0; 
        } else {
            while (temp > 0) {
                int digit = temp % 10; 
                product *= digit;      
                temp /= 10;            
            }
        }

        System.out.println(product);

        scanner.close();
    }
}
