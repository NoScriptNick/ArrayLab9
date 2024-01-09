import java.lang.Math;
import java.util.Scanner;
public class PartOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] dataPoints = new int [100];
        int sum = 0;
        int avg = 0;
        int max = 0;
        int min = 101;

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int)(Math.random() * 100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
            avg = sum/100;
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
        }
        System.out.println("");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}