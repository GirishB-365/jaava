import java.util.Scanner;
public class task6 {
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindromePrime(int n) {
        return isPalindrome(n) && isPrime(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPalindromePrime(num)) {
            System.out.println(num + " is a palindrome prime.");
        } else {
            System.out.println(num + " is not a palindrome prime.");
        }

        scanner.close();
    }
}

