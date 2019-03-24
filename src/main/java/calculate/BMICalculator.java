package calculate;


import java.util.Arrays;

public class BMICalculator implements Calculate {

    private int weight;
    private int height;
    private double BMI;

    public BMICalculator(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String calculate() {
        double heightInMeters = (double)height/100;
        double BMI = weight / Math.pow(heightInMeters, 2);
        this.BMI = BMI;
        return "Your BMI is: " + BMI;
    }

    @Override
    public String interpret() {
        double[] table = new double[]{15, 16, 18.5, 25, 30, 35, 40, 45, 50, 60, (double)Integer.MAX_VALUE};

        BMI = (int)(100 * BMI);
        BMI = BMI / 100.00;

        int index = Math.abs(Arrays.binarySearch(table,BMI)) - 1;
        System.out.println(BMI);
        System.out.println("index is: " + index);
        switch(index){
            case 0: return "You are: Very severely underweight";
            case 1: return "You are: Severely underweight";
            case 2: return "You are: Underweight";
            case 3: return "You are: Normal (healthy weight)";
            case 4: return "You are: Overweight";
            case 5: return "You are: Obese Class I (Moderately obese)";
            case 6: return "You are: Obese Class II (Severely obese)";
            case 7: return "You are: Obese Class III (Very severely obese)";
            case 8: return "You are: Obese Class IV (Morbidly Obese)";
            case 9: return "You are: Obese Class V (Super Obese)";
            case 10: return "You are: Obese Class VI (Hyper Obese)";
            default: return "Something went wrong";
        }
    }

}
