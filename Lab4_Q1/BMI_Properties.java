package Lab4_Q1;

public class BMI_Properties {

    final static double POUND_TO_KG = 0.45359237;
    final static double INCH_TO_METER = 0.0254;
    private int weight;
    private int height;

    public BMI_Properties(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double getBMI() {
        double newWeight = getWeight() * POUND_TO_KG;
        double newHeight = getHeight() * INCH_TO_METER;

        double displayBMI = newWeight / (Math.pow(newHeight, 2));

        return displayBMI;
    }

    public String getInterpretation() {
        String[] interpretation = {"Underweight", "Normal", "Overweight", "Obese"};

        double BMI = getBMI();
        int index = 0;
        if(BMI < 18.5)
        {
            index = 0;
        }
        else if(BMI < 25.0)
        {
            index = 1;
        }
        else if(BMI < 30.0)
        {
            index = 2;
        }
        else
        {
            index = 3;
        }
        return interpretation[index];
    }
}
