package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntegerProcessor intProcessor = new IntegerProcessor();
        boolean validInput = false;
        int num = 0;

        //проверка на правильный ввод
        while (!validInput) {
            try {
                System.out.print("Enter the number: ");
                num = sc.nextInt();
                if (num < 0){
                    System.out.println("The number must be positive integer.");
                }else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input (the number must be an integer)");
                sc.next();
            }
        }

        //нахождение простых множителей
        System.out.println("Simple multipliers of number " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && intProcessor.isPrime(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
