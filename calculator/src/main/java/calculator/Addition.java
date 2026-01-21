package calculator;

import java.util.Scanner; 

public class Addition {
    public static void main(String[] args) {
    	int num1, num2, sum;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt(); 

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt(); 

        sum = num1 + num2;

        System.out.println("The sum of these numbers is: " + sum);
        scanner.close();
    }
}
