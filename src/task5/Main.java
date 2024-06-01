package task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter safe volume: ");
        final int SAFE_VOLUME = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the number of items: ");
        final int NUM_OF_ITEMS = sc.nextInt();
        sc.nextLine();

        //создание списка предметов
        ArrayList<Item> items = Item.createItemArrayList(NUM_OF_ITEMS);
        //создание и заполнение сейфа
        Safe safe = new Safe(SAFE_VOLUME);
        safe.fillTheSafe(items);
        safe.printSafeContent();
    }
}
