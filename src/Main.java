import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Input first number: " + firstNumber);
        System.out.println("Input first number: " + secondNumber);

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));

        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));

        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));

    }
}
