
//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take inputs
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate HCF using Euclidean algorithm
        int a = num1, b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int hcf = a;
        
        // Calculate LCM
        int lcm = (num1 * num2) / hcf;
        
        // Print results
        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
        
        scanner.close();
    }
}
