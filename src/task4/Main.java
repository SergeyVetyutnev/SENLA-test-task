package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = sc.nextLine();
        sc.close();

        LargeNumberPrinter printer = new LargeNumberPrinter();
        printer.printLargeNumber(num);
    }
}
