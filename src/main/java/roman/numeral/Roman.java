package roman.numeral;

public class Roman {

    public static int toInt(String romanNumeral) {

        String[] letters = romanNumeral.split("");

        int result = 0;

        int previous = 0;

        for (int i = letters.length - 1; i > -1; i--) {
            int next = 0;
            String letter = letters[i];

            if ("I".equals(letter)) {
                next = 1;
            } else if ("V".equals(letter)) {
                next = 5;
            } else if ("X".equals(letter)) {
                next = 10;
            } else if ("L".equals(letter)) {
                next = 50;
            } else if ("C".equals(letter)) {
                next = 100;
            } else if ("D".equals(letter)) {
                next = 500;
            } else if ("M".equals(letter)) {
                next = 1000;
            }

            if (next > previous || next == previous) {
                result += next;
            } else {
                result -= next;
            }
            previous = next;

        }

        return result;
    }

    public static String toNumeral(int number) {
        String[] m = {"", "M", "MM", "MMM"};
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String thousands = m[number/1000];
        String hundreds = c[(number % 1000)/100];
        String tens = x[(number % 100)/10];
        String ones = i[(number % 10)];

        String result = thousands + hundreds + tens + ones;

        return result;
    }



}
