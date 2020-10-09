package section5;

public class NumberToWords {
    public static void numberToWords(int number) {
        int digitCount = getDigitCount(number);
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int lastNumber;
        number = reverse(number);
        int digitCount2 = getDigitCount(number);
        StringBuilder stringBuilder = new StringBuilder();
        do {
            lastNumber = number % 10;
            switch (lastNumber) {
                case 1:
                    stringBuilder.append("One");
                    break;
                case 2:
                    stringBuilder.append("Two");
                    break;
                case 3:
                    stringBuilder.append("Three");
                    break;
                case 4:
                    stringBuilder.append("Four");
                    break;
                case 5:
                    stringBuilder.append("Five");
                    break;
                case 6:
                    stringBuilder.append("Six");
                    break;
                case 7:
                    stringBuilder.append("Seven");
                    break;
                case 8:
                    stringBuilder.append("Eight");
                    break;
                case 9:
                    stringBuilder.append("Nine");
                    break;
                default:
                    stringBuilder.append("Zero");
                    break;
            }
            stringBuilder.append(" ");
            number /= 10;
        } while (number > 0);
        while (digitCount > digitCount2) {
            stringBuilder.append("Zero");
            stringBuilder.append(" ");
            digitCount2++;
        }
        System.out.println(stringBuilder.toString());
    }

    public static int reverse (int initialNumber) {
        int reversedNumber = 0;
        boolean isNegative = initialNumber < 0;
        if (isNegative)
            initialNumber *= -1;
        while (initialNumber > 0) {
            reversedNumber += initialNumber % 10;
            reversedNumber *= 10;
            initialNumber /= 10;
        }
        reversedNumber /= 10;
        if (isNegative)
            return reversedNumber * (-1);
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        return Integer.toString(number).length();
    }
}
