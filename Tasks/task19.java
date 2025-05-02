import java.util.Scanner;
public class task19 {
    public static int getAsciiValue(char c) {
        return (int) c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        System.out.println("ASCII value of '" + ch + "' is: " + getAsciiValue(ch));

        scanner.close();
    }
}


