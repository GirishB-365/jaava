import java.util.Scanner;

public class task16 {

    public static boolean isKaprekar(int n) {
        if (n == 1) return true;

        long square = (long) n * n;
        String str = String.valueOf(square);
        for (int i = 1; i < str.length(); i++) {
            int left = Integer.parseInt(str.substring(0, i));
            int right = Integer.parseInt(str.substring(i));
            if (right != 0 && left + right == n) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isKaprekar(num)) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }

        scanner.close();
    }
}


    



  

