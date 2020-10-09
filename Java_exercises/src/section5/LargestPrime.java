package section5;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;
        int temp;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                temp = number / i;
            }
            else continue;
            for (int j = 2; j <= temp; j++) {
                if (j == temp) {
                    return temp;
                }
                if (temp % j == 0)
                    break;
            }
        }
        return number;
    }
}
