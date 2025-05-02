import java.util.Scanner;
public class task15 {
    public static void countCases(String input) {
        int uppercase = 0, lowercase = 0;
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) uppercase++;
            else if (Character.isLowerCase(c)) lowercase++;
        }

        System.out.println("Uppercase letters: " + uppercase);
        System.out.println("Lowercase letters: " + lowercase);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        countCases(input);
        scanner.close();
    }
}


