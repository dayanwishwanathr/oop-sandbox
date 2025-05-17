package Lecture01Excercises;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = input.nextInt();
        } while (number >= 0);

        System.out.println("You entered: " + number);
        input.close();
    }
}


