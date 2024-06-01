package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringProcessor strProcessor = new StringProcessor();
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        //нахождение суммы цифр в строке
        int sum = strProcessor.sumDigits(str);
        System.out.print("Sum of digits: ");
        System.out.println(sum);

        sc.close();
    }
}
