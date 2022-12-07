public class RaceUtility {

    public static double milesToKm(double mi) {
        return mi * 1.609344;
    }

    public static double kmToMiles(double km) {
        return km / 1.609344;
    }

    public static String makeProper(String msg) {
        int strLen = msg.length();
        boolean isNewWord = true;
        String newMsg = "";

        for (int i = 0; i < msg.length(); i++) {
            String letter = msg.charAt(i) + "";

            if(isNewWord) {
                newMsg += letter.toUpperCase();
                isNewWord = false;
            } else {
                newMsg += letter.toLowerCase();
            }
            if (letter.equals(" ")) {
                isNewWord = true;
            }
        }

        return newMsg;
    }
}
