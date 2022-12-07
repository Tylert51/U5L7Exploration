public class RaceUtilityRunner
{
    public static void main(String[] args)
    {
        System.out.println(distanceConverter(13.85,40));

        System.out.println(distanceConverter(26.42,3.5));

        System.out.println(distanceConverter(5,20.5));

        System.out.println(distanceConverter(0,0));


        System.out.println(formatStr("welcome to the marathon!"));

        System.out.println(formatStr("It's TIME for THE 5k!"));

        System.out.println(formatStr("runners, take your marks..."));

        System.out.println(formatStr("2 MILES TO GO!"));

        System.out.println(formatStr("water break in 0.5 miles"));
    }

    public static String distanceConverter(double mi, double km) {
        return RaceUtility.milesToKm(mi) + "\n" + RaceUtility.kmToMiles(km);
    }

    public static String formatStr(String msg) {
        return RaceUtility.makeProper(msg);
    }
}
