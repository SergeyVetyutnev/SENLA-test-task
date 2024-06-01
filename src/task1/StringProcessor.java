package task1;

public class StringProcessor {
    public int sumDigits(String str) {
        int sum = 0;

        if (str == null || str.isEmpty()) {
            return sum;
        }

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol > '0' && symbol <= '9') {
                sum += symbol - '0';
            }
        }
        return sum;
    }
}
