import java.util.Scanner;
public class task12 {
        public static boolean isDuckNumber(int n) {
        String numStr = String.valueOf(n);

      
        if (numStr.charAt(0) == '0') return false;

        
        return numStr.contains("0");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }

        scanner.close();
    }
}


