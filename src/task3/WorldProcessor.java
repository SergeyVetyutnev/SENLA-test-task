package task3;

import java.util.ArrayList;
import java.util.List;

public class WorldProcessor {
    //все гласные
    private static final String VOWELS = "аеёиоуыэюя";

    public List<Word> processSentence(String sentence) {
        List<Word> words = new ArrayList<>();
        String[] parts = sentence.split(" ");
        //из каждого слова создается объект
        for (String part : parts) {
            Word word = new Word(part, countVowels(part));
            words.add(word);
        }
        return words;
    }

    public int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            //проверяет, есть ли символ в списке гласных VOWELS
            if (VOWELS.indexOf(Character.toLowerCase(word.charAt(i))) != -1) {
                count++;
            }
        }
        return count;
    }

    public String toUpperCaseFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (VOWELS.indexOf(Character.toLowerCase(word.charAt(i))) != -1) {
                return word.substring(0, i) + Character.toUpperCase(word.charAt(i)) + word.substring(i + 1);
            }
        }
        return word;
    }
}