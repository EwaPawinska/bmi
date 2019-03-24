package calculate;

public class BMICalculator implements Calculate {

    private int weight;
    private int height;

    @Override
    public String calculate() {
        return "0";
    }

    @Override
    public String interpret() {
        return "";
    }

    public BMICalculator(int height, int weight) {
    }
}
