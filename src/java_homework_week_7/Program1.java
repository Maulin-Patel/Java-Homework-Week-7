package java_homework_week_7;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a Number: ");
        int a = scan.nextInt();
// if-else Condition using ternary operator to find whether value is odd or even and displaying message accordingly in console.
        if (a % 2 == 0) {
            System.out.println("The inserted number " + a + " is Even");
        } else {
            System.out.println("The inserted number " + a + " is Odd");
        }
        scan.close();
    }
}

