

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Enter the value of x:");
        x = scanner.nextInt();
        
        double sq = Math.sqrt(x);
        
        if (sq == (int) sq) {
            System.out.println("The given number is a perfect square");
        } else {
            System.out.println("The given number is not a perfect square");
        }
    }
}
