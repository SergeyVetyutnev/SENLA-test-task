package task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Safe {
    private final int capacity;
    private final List<Item> items;

    // конструкторы
    public Safe(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    //методы
    public void addItem(Item item){
        if (getFreeCapacity() >= item.getVolume()){
            items.add(item);
            //System.out.println(item + " was placed in the safe");
        }
    }

    public int getFreeCapacity(){
        int usedCapacity = items.stream().mapToInt(Item::getVolume).sum();
        return capacity - usedCapacity;
    }

    public  void fillTheSafe(List<Item> availableItems){
        availableItems.sort(Comparator.comparingDouble(Item::getValueCoefficient).reversed());

        for (Item item : availableItems){
            addItem(item);
            if (getFreeCapacity() == 0){
                break;
            }
        }
    }

    public void printSafeContent(){
        System.out.println("Safe capacity: " + capacity);
        if (items.isEmpty()){
            System.out.println("Safe is empty");
        }else {
            System.out.println("Safe contents:");
            items.forEach(System.out::println);
            int totalVolume = items.stream().mapToInt(Item::getVolume).sum();
            int totalValue = items.stream().mapToInt(Item::getValue).sum();
            System.out.println("TOTAL VOLUME OF THE SAFE CONTENTS: " + totalVolume);
            System.out.println("TOTAL VALUE OF THE SAFE CONTENTS: " + totalValue);
        }
    }


}
