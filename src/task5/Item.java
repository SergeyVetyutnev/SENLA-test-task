package task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Item {
    private final int value;
    private final int volume;
    private final double valueCoefficient; //оценка пользы предмета, чем больше ценность и меньше объем - тем лучше

    //конструкторы
    public Item(int value, int volume) {
        this.value = value;
        this.volume = volume;
        /*простая формула, хорошо штрафует за большой объем
         * так же можно поменять на формулу:
         * Коэффициент пользы = Ценность * log2(1 / (Объем + 1))*/
        this.valueCoefficient = (double) value / (volume + 1);
    }

    //методы
    public static ArrayList<Item> createItemArrayList(int NUM_OF_ITEMS){
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>(NUM_OF_ITEMS);

        for (int i = 0; i < NUM_OF_ITEMS; i++) {
            System.out.println("Enter the value and volume of " + (i+1) + " item out of " +
                    NUM_OF_ITEMS + " separated by space: ");
            String[] input = sc.nextLine().split(" ");
            int value = Integer.parseInt(input[0]);
            int volume = Integer.parseInt(input[1]);

            Item item = new Item(value, volume);
            items.add(item);
        }
        sc.close();
        return items;
    }

    public static void printItemArrayList(ArrayList<Item> items){
        for (Item item : items){
            System.out.println(item);
        }
    }

    //аннотации
    @Override
    public String toString(){
        return "Item{value=" + value + ", volume=" + volume + "}";
    }

    //геттеры
    public int getVolume() {
        return volume;
    }

    public int getValue() {
        return value;
    }

    public double getValueCoefficient() {
        return valueCoefficient;
    }
}
