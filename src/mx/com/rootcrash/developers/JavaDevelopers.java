package mx.com.rootcrash.developers;


import java.util.logging.Logger;


public class JavaDevelopers {

    private static final Logger logger = Logger.getLogger(JavaDevelopers.class.getName());

    public static void main(String[] args) {
        boolean data = isCatPlaying(true, 45);
        System.out.println(data);
    }


    /**
     * Positive, Negative or Zero
     * <p>
     * Write a method called checkNumber with an int parameter number,
     * the method should not return any value, and it needs to print out:
     * 'Positive' if the parameter number is > 0
     * 'Negative' if the parameter number is < 0
     * 'Zero' if the parameter number is equal to 0
     *
     * @param number int
     */
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        }
    }

    /**
     * Speed Converter
     * <p>
     * Write a method called toMilesPerHour that has 1 parameter of type double with the name
     * kilometerPerHour. This method needs to return the redounded value of the calculation of type long.
     * If the parameter kilometerPerHour is less than 0, the method toMilesPerHour needs return -1 to indicate
     * an invalid value. Otherwise, if its positive, calculate the value of miles per hour, round it
     * and return it.
     *
     * @param kilometerPerHour double
     */
    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }
        return Math.round(kilometerPerHour / 1.609);
    }

    /**
     * Print Conversion
     * <p>
     * Write another method called printConversion with 1 parameter of type double with the name kilometerPerHour.
     * This method should not return anything(void) and it needs to calculate milesPerHour from the kilometerPerHour
     * parameter. Then it needs to print a message in the format "XX km/h = YY mi/h"
     * XX represents the original value kilometerPerHour
     * YY represents the rounded milesPerHour from the kilometerPerHour parameter.
     * <p>
     * If the parameter kilometerPerHour is < 0 the print the text 'invalid value'
     *
     * @param kilometersPerHour double
     */

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour
                    + " km/h = " + milesPerHour + " min/h");
        }
    }


    /**
     * MegaBytes Converter
     * <p>
     * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
     * The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes
     * from the kilobytes parameter. Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
     * <p>
     * XX represents the original value kiloBytes.
     * YY represents the calculated megabytes.
     * ZZ represents the calculated remaining kilobytes.
     * <p>
     * For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
     * If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
     *
     * @param kiloBytes int
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println(kiloBytes < 0 ? "Invalid Value" : kiloBytes + " KB = " + kiloBytes / 1024 + " MB and " + kiloBytes % 1024 + " KB");
    }

    /**
     * Barking Dog
     * <p>
     * We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
     * Write a method shouldWakeUp that has 2 parameters.
     * 1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
     * 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
     * We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
     * <p>
     * In all other cases return false.
     * If the hourOfDay parameter is less than 0 or greater than 23 return false.
     * <p>
     * Examples of input/output:
     * <p>
     * * shouldWakeUp (true, 1); → should return true
     * * shouldWakeUp (false, 2); → should return false since the dog is not barking.
     * * shouldWakeUp (true, 8); → should return false, since it's not before 8.
     * * shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.
     *
     * @param barking   boolean
     * @param hourOfDay int
     */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        return (barking) && (hourOfDay < 8 || hourOfDay > 22);
    }

    /**
     * Year Calculator
     * <p>
     * Write a method isLeapYear with a parameter of type int named year.
     * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
     * If the parameter is not in that range return false. Otherwise, if it is in the valid range, calculate if
     * the year is a leap year and return true if it is a leap year, otherwise return false.
     * <p>
     * <p>
     * To determine whether a year is a leap year, follow these steps:
     * 1. If the year is evenly divisible by 4, go to step
     * 2. Otherwise, go to step 5.2. If the year is evenly divisible by 100, go to step
     * 3. Otherwise, go to step 4.3. If the year is evenly divisible by 400, go to step
     * 4. Otherwise, go to step 5.4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
     * 5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
     * <p>
     * The following years are not leap years:
     * 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
     * This is because they are evenly divisible by 100 but not by 400.
     * The following years are leap years:
     * 1600, 2000, 2400
     * This is because they are evenly divisible by both 100 and 400.
     * <p>
     * Examples of input/output:
     * * isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)
     * * isLeapYear(1600); → should return true since 1600 is a leap year
     * * isLeapYear(2017); → should return false since 2017 is not a leap year
     * * isLeapYear(2000);  → should return true because 2000 is a leap year
     * <p>
     * NOTE: The method isLeapYear needs to be defined as public static like we have been doing so far in the course.
     * NOTE: Do not add a  main method to solution code.
     *
     * @param year int
     */
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        }
        return false;
    }

    /**
     * Decimal Comparator
     * <p>
     * Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
     * The method should return boolean and it needs to return true if two double numbers are the same up
     * to three decimal places. Otherwise, return false.
     *
     * @param firstElement  double
     * @param secondElement double
     * @return false should return false since numbers are not equal up to 3 decimal places
     */
    public static boolean areEqualByThreeDecimalPlaces(double firstElement, double secondElement) {
        return (int) (firstElement * 1000) == (int) (secondElement * 1000);
    }

    /**
     * Equal Sum Checker
     * <p>
     * Write a method hasEqualSum with 3 parameters of type int.
     * The method should return boolean and it needs to return true if the sum of the first and
     * second parameter is equal to the third parameter. Otherwise, return false.
     *
     * @param firstElement
     * @param secondElement
     * @param thirdElement
     * @return false
     */
    public static boolean hasEqualSum(int firstElement, int secondElement, int thirdElement) {
        return firstElement + secondElement == thirdElement;
    }

    /**
     * Teen Number check
     * <p>
     * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
     * <p>
     * Write a method named hasTeen with 3 parameters of type int.
     * <p>
     * The method should return boolean and it needs to return true if one of the
     * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
     *
     * @param firsElement
     * @param secondElement
     * @param thirdElement
     * @return false
     */
    public static boolean hasTeen(int firsElement, int secondElement, int thirdElement) {
        return isTeen(firsElement) || isTeen(secondElement) || isTeen(thirdElement);
    }

    /**
     * Is Teen
     * <p>
     * Write a method named isTeen with 1 parameter of type int. The method should return boolean
     * and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive).
     * Otherwise return false.
     *
     * @param age
     * @return false
     */
    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    /**
     * Seconds and minutes challenge
     * <p>
     * Create a method called getDurationString with two parameters, first parameter minutes and 2nd
     * parameters seconds. You should validate that the first parameter minutes is >= 0
     * Yo should validate that the 2nd parameter seconds is >=0 and <=59. The method should
     * return "Invalid value" in the method if either of the above are not true.
     * If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and
     * seconds passed to this method and return that value as string in format "XXh YYm ZZs" where XX represents
     * a number of hours, YY the minutes and ZZ the seconds.
     *
     * @param minutes
     * @param seconds
     * @return
     */
    public static final String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    /**
     * Create a method called getDurationString with one parameters. Validate that it is >= 0, and return
     * "Invalid value" if it is not true. If is valid, then calculate how many minutes are in the seconds value
     * and then call the other overload method passing the correct minutes and seconds calculated so that it can
     * calculate correctly.
     * Call both methods to print values to the console.
     *
     * @param seconds
     * @return
     */
    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }


    /**
     * Area calculator
     * <p>
     * Write a method named area with one double parameter named radius.
     * The method needs to return a double value that represents the area of a circle.
     * If the parameter radius is negative then return -1.0 to represent an invalid value.
     *
     * @param radius
     * @return
     */
    public static double area(double radius) {
        if (radius >= 0) {
            return Math.PI * radius * radius;
        } else return -1;

    }

    /**
     * Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent
     * the sides of a rectangle. The method needs to return an area of a rectangle.
     * If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
     *
     * @param x
     * @param y
     * @return
     */
    public static double area(double x, double y) {
        if (x >= 0 && y >= 0) {
            return y * x;
        } else return -1;
    }

    /**
     * Minutes to years and days calculator
     * <p>
     * Write a method printYearsAndDays with parameter of type long named minutes.
     * <p>
     * The method should not return anything (void) and it needs to calculate the years and days from
     * the minutes parameter. If the parameter is less than 0, print text "Invalid Value". Otherwise, if the
     * parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
     * XX represents the original value minutes.
     * YY represents the calculated years.
     * ZZ represents the calculated days.
     *
     * @param minutes
     */
    public static void printYearsAndDays(long minutes) {

        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long remDays = days % 365;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + years + " y " + "and " + remDays + " d");
        }
    }

    /**
     * Equality printer
     * <p>
     * Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
     * If one of the parameters is less than 0, print text "Invalid Value".
     * If all numbers are equal print text "All numbers are equal"
     * If all numbers are different print text "All numbers are different".
     * Otherwise, print "Neither all are equal or different".
     *
     * @param firstParameter
     * @param secondParameter
     * @param thirdParameter
     */
    public static void printEqual(int firstParameter, int secondParameter, int thirdParameter) {
        if ((firstParameter < 0) || (secondParameter < 0) || (thirdParameter < 0)) {
            System.out.println("Invalid Value");
        } else if ((firstParameter == secondParameter) && (secondParameter == thirdParameter)) {
            System.out.println("All numbers are equal");
        } else if (!(firstParameter == secondParameter) && !(secondParameter == thirdParameter) && !(thirdParameter == firstParameter)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }


    /**
     * Playing cat
     * <p>
     * Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing,
     * otherwise return false
     * 1st parameter should be of type boolean and be named summer it represents if it is summer.
     * 2nd parameter represents the temperature and is of type int with the name temperature.
     *
     * @param summer
     * @param temperature
     * @return false if cat not playing
     */
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return (temperature >= 25) && (temperature <= 45);
        } else {
            return (temperature >= 25) && (temperature <= 35);
        }
    }

}
