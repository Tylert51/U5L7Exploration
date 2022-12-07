public class RaceUtilityRunner
{
    public static void main(String[] args)
    {
        double miles1 = 13.85;
        double km1 = 40;
        System.out.println(RaceUtility.milesToKm(miles1));
        System.out.println(RaceUtility.kmToMiles(km1));

        double miles2 = 26.42;
        double km2 = 3.5;
        System.out.println(RaceUtility.milesToKm(miles2));
        System.out.println(RaceUtility.kmToMiles(km2));

        double miles3 = 5;
        double km3 = 20.50;
        System.out.println(RaceUtility.milesToKm(miles3));
        System.out.println(RaceUtility.kmToMiles(km3));

        double miles4 = 0;
        double km4 = 0;
        System.out.println(RaceUtility.milesToKm(miles4));
        System.out.println(RaceUtility.kmToMiles(km4));

        String title = "welcome to the marathon!";
        System.out.println(RaceUtility.makeProper(title));

        title = "It's TIME for THE 5k!";
        System.out.println(RaceUtility.makeProper(title));

        title = "runners, take your marks...";
        System.out.println(RaceUtility.makeProper(title));

        title = "2 MILES TO GO!";
        System.out.println(RaceUtility.makeProper(title));

        title = "water break in 0.5 miles";
        System.out.println(RaceUtility.makeProper(title));
    }
}
