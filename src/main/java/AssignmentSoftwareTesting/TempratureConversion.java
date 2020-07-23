package AssignmentSoftwareTesting;

import java.text.DecimalFormat;

public class TempratureConversion implements TempratureConversationInterface {
    public double[] calculate(double celcius) {
        double k=celciusToKelvin(celcius);
        double f=celciusToFaren( celcius);
         DecimalFormat df = new DecimalFormat("0.00");
        double[] array={k,f};
        return array;
    }

    public double celciusToKelvin(double celcius) {
        return celcius + 273;
    }

    public double celciusToFaren(double celcius) {
        double f=1.80*(celcius) + 32;
        return f;
    }
}
