package task3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        //обработчик
        WorldProcessor worldProcessor = new WorldProcessor();
        //создание списка слов
        List<Word> words = new WorldProcessor().processSentence(sentence);
        //сортировка по убыванию
        words.sort(Comparator.comparingInt(Word::getVowelCount).reversed());
        //вывод
        System.out.println("Sorted words:");
        for (Word word : words){
            System.out.println(worldProcessor.toUpperCaseFirstVowel(word.getWord()));
        }
        sc.close();
    }
}
