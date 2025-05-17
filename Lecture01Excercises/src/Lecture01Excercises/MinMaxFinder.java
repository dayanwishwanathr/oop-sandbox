package Lecture01Excercises;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter three integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int largest = Math.max(num1, Math.max(num2, num3));
        int smallest = Math.min(num1, Math.min(num2, num3));
        
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        
        scanner.close();
    }
}
