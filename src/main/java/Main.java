import calculate.BMICalculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int height;
        int weight;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in [cm]:");
        height = sc.nextInt();

        System.out.println("Enter your weight in [kg]:");
        weight = sc.nextInt();

        BMICalculator BMIcalculator = new BMICalculator(height, weight);
        System.out.println(BMIcalculator.calculate());
        System.out.println(BMIcalculator.interpret());
    }
}
