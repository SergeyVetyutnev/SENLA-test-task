package task4;

public class LargeNumberPrinter {
    private static final String[][] LARGE_DIGITS = {
            {
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            },
            {
                    "  *  ",
                    " **  ",
                    "  *  ",
                    "  *  ",
                    " *** "
            },
            {
                    " *** ",
                    "    *",
                    " *** ",
                    "*    ",
                    " *** "
            },
            {
                    " *** ",
                    "    *",
                    " *** ",
                    "    *",
                    " *** "
            },
            {
                    "*   *",
                    "*   *",
                    " ****",
                    "    *",
                    "    *"
            },
            {
                    "**** ",
                    "*    ",
                    "**** ",
                    "    *",
                    "**** "
            },
            {
                    " *** ",
                    "*    ",
                    "**** ",
                    "*   *",
                    " *** "
            },
            {
                    "*****",
                    "    *",
                    "   * ",
                    "  *  ",
                    " *   "
            },
            {
                    " *** ",
                    "*   *",
                    " *** ",
                    "*   *",
                    " *** "
            },
            {
                    " *** ",
                    "*   *",
                    " ****",
                    "    *",
                    " *** "
            }
    };

    private final static int ROW_COUNT = 5;

    public void printLargeNumber(String num) {
        int maxDigitFromNum = 0;
        //проверяет, есть ли что-то кроме цифр в строке
        if (isNumber(num)) {
            maxDigitFromNum = maxDigit(Integer.parseInt(num));
        }else {
            System.out.println("Only digits should be in input");
            return;
        }

        for (int i = 0; i < ROW_COUNT; i++) { //цифры печатаются построчно сверху вниз, так как у всех одинаковая высота 5
            StringBuilder line = new StringBuilder();

            for (char digit : num.toCharArray()) {
                    int d = Character.getNumericValue(digit);
                    if (d == maxDigitFromNum) { // если цифра максимальная, вместо звездочек вставляются цифры
                        line.append(LARGE_DIGITS[d][i].replace('*', Character.forDigit(maxDigitFromNum, 10))).append("   ");
                    } else { //иначе вставляются просто звездочки
                        line.append(LARGE_DIGITS[d][i]).append("   ");
                    }
            }
            System.out.println(line);
        }
    }

    private int maxDigit(int num) {
        int max = 0;
        while (num > 0) {
            int digit = num % 10;
            if (max < digit) {
                max = digit;
            }
            num /= 10;
        }
        return max;
    }

    private boolean isNumber(String str){
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
