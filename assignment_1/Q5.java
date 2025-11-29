//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all

import java.util.Scanner;
public class SumUntilX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter numbers (enter 'x' to stop and get sum):");
        
        while (true) {
            String input = scanner.next();
            if (input.equals("x")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x'.");
            }
        }
        
        System.out.println("Sum of all numbers: " + sum);
        scanner.close();
    }
}