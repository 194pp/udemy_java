package section5;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;
        while(true) {
            try {
                int temp = scanner.nextInt();
                sum+= temp;
                count++;
            } catch (Exception e) {
                break;
            }
        }
        if(count!=0)
            avg = Math.round((double)sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
