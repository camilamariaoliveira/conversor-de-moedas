package models;

public class Currency {
    private double value;
    private String unit;

    public Currency(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public static boolean validate(String input){
        try {
            Double.valueOf(input);
            return true;
        } catch (NumberFormatException exception){
            return false;
        }
    }
}
