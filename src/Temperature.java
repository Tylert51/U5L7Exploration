public class Temperature {
    private double highTemp;
    private double lowTemp;
    private String tempScale;

    // Precondition: scale must be: "F" or "C"; anything else will default to "F"
    public Temperature(double high, double low, String scale) {
        highTemp = high;
        lowTemp = low;

        if (scale.equals("F") || scale.equals("C")) {
            tempScale = scale;
        } else {
            tempScale = "F";
        }
    }


// 1. Add your two static methods here:
    public static double convertCtoF(double temp) {
            return (temp * (9.0 / 5)) + 32;
    }

    public static double convertFtoC(double temp) {
            return (temp - 32) * (5.0 / 9);
    }

// 2. Add your two instance methods here:
    public void changeToC() {
        if(tempScale.equals("F")) {
            tempScale = "C";
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);
        }
    }

    public void changeToF() {
        if(tempScale.equals("C")) {
            tempScale = "F";
            highTemp = convertCtoF(highTemp);
            lowTemp = convertCtoF(lowTemp);
        }
    }

// 3. Add your private static helper rounding "utility" method here:
    private static double round(double num) {
        return Math.round(num * 100) / 100.0;
    }

// 4. Complete the toString method below (using your static helper method)

    public String toString() {
        return "High temperature: " + round(highTemp) +  " " + tempScale +
                "\nLow temperature: " + round(lowTemp) + " " + tempScale;
    }
}