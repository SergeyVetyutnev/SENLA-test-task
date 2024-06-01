package task3;

public class Word {
    private String word;
    private int vowelCount;

    public Word(String word, int vowelCount){
        this.word = word;
        this.vowelCount = vowelCount;
    }

    public int getVowelCount() {
        return vowelCount;
    }

    public String getWord() {
        return word;
    }
}
