package mx.com.rootcrash.developers;


import java.util.logging.Logger;


public class JavaDevelopers {

    private static final Logger logger = Logger.getLogger(JavaDevelopers.class.getName());

    public static void main(String[] args) {

       boolean data =  hasTeen(25, 35, 24);

        System.out.println(data);
    }


    /**
     * Positive, Negative or Zero
     *
     * Write a method called checkNumber with an int parameter number,
     * the method should not return any value, and it needs to print out:
     * 'Positive' if the parameter number is > 0
     * 'Negative' if the parameter number is < 0
     * 'Zero' if the parameter number is equal to 0
     * @param number int
     * */
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if(number < 0) {
            System.out.println("Negative");
        } else if(number == 0) {
            System.out.println("Zero");
        }
    }

    /**
     * Speed Converter
     *
     * Write a method called toMilesPerHour that has 1 parameter of type double with the name
     * kilometerPerHour. This method needs to return the redounded value of the calculation of type long.
     * If the parameter kilometerPerHour is less than 0, the method toMilesPerHour needs return -1 to indicate
     * an invalid value. Otherwise, if its positive, calculate the value of miles per hour, round it
     * and return it.
     * @param kilometerPerHour double
     * */
    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }
        return Math.round(kilometerPerHour / 1.609);
    }

    /**
     * Print Conversion
     *
     * Write another method called printConversion with 1 parameter of type double with the name kilometerPerHour.
     * This method should not return anything(void) and it needs to calculate milesPerHour from the kilometerPerHour
     * parameter. Then it needs to print a message in the format "XX km/h = YY mi/h"
     * XX represents the original value kilometerPerHour
     * YY represents the rounded milesPerHour from the kilometerPerHour parameter.
     *
     * If the parameter kilometerPerHour is < 0 the print the text 'invalid value'
     * @param kilometersPerHour double
     * */

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
     *
     * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
     * The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes
     * from the kilobytes parameter. Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
     *
     * XX represents the original value kiloBytes.
     * YY represents the calculated megabytes.
     * ZZ represents the calculated remaining kilobytes.
     *
     * For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
     * If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
     * @param kiloBytes int
     * */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println(kiloBytes <  0 ? "Invalid Value" : kiloBytes+" KB = "+kiloBytes/1024+" MB and "+kiloBytes%1024+" KB");
    }

    /**
     * Barking Dog
     *
     * We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
     * Write a method shouldWakeUp that has 2 parameters.
     * 1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
     * 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
     * We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
     *
     * In all other cases return false.
     * If the hourOfDay parameter is less than 0 or greater than 23 return false.
     *
     * Examples of input/output:
     *
     * * shouldWakeUp (true, 1); → should return true
     * * shouldWakeUp (false, 2); → should return false since the dog is not barking.
     * * shouldWakeUp (true, 8); → should return false, since it's not before 8.
     * * shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.
     * @param barking boolean
     * @param hourOfDay int
     * */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        return (barking) && (hourOfDay < 8 || hourOfDay > 22);
    }

    /**
     * Year Calculator
     *
     * Write a method isLeapYear with a parameter of type int named year.
     * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
     * If the parameter is not in that range return false. Otherwise, if it is in the valid range, calculate if
     * the year is a leap year and return true if it is a leap year, otherwise return false.
     *
     *
     * To determine whether a year is a leap year, follow these steps:
     * 1. If the year is evenly divisible by 4, go to step
     * 2. Otherwise, go to step 5.2. If the year is evenly divisible by 100, go to step
     * 3. Otherwise, go to step 4.3. If the year is evenly divisible by 400, go to step
     * 4. Otherwise, go to step 5.4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
     * 5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
     *
     * The following years are not leap years:
     * 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
     * This is because they are evenly divisible by 100 but not by 400.
     * The following years are leap years:
     * 1600, 2000, 2400
     * This is because they are evenly divisible by both 100 and 400.
     *
     * Examples of input/output:
     * * isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)
     * * isLeapYear(1600); → should return true since 1600 is a leap year
     * * isLeapYear(2017); → should return false since 2017 is not a leap year
     * * isLeapYear(2000);  → should return true because 2000 is a leap year
     *
     * NOTE: The method isLeapYear needs to be defined as public static like we have been doing so far in the course.
     * NOTE: Do not add a  main method to solution code.
     * @param year int
     * */
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Decimal Comparator
     *
     * Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
     * The method should return boolean and it needs to return true if two double numbers are the same up
     * to three decimal places. Otherwise, return false.
     * @param firstElement double
     * @param secondElement double
     * @return true should return true since numbers are equal up to 3 decimal places
     * @return false should return false since numbers are not equal up to 3 decimal places
     * */
    public static boolean areEqualByThreeDecimalPlaces(double firstElement, double secondElement) {
        return (int) (firstElement * 1000) == (int) (secondElement * 1000) ? true : false;
    }

    /**
     * Equal Sum Checker
     *
     * Write a method hasEqualSum with 3 parameters of type int.
     * The method should return boolean and it needs to return true if the sum of the first and
     * second parameter is equal to the third parameter. Otherwise, return false.
     * @param firstElement
     * @param secondElement
     * @param thirdElement
     * @return true
     * @return false
     * */
    public static boolean hasEqualSum(int firstElement, int secondElement, int thirdElement) {
        return firstElement + secondElement == thirdElement ? true : false;
    }

    /**
     * Teen Number check
     *
     * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
     *
     * Write a method named hasTeen with 3 parameters of type int.
     *
     * The method should return boolean and it needs to return true if one of the
     * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
     * @param firsElement
     * @param secondElement
     * @param thirdElement
     * @return true
     * @return false
     * */
    public static boolean hasTeen(int firsElement, int secondElement, int thirdElement) {
        return isTeen(firsElement) || isTeen(secondElement) || isTeen(thirdElement);
    }

    /**
     * Is Teen
     *
     * Write a method named isTeen with 1 parameter of type int. The method should return boolean
     * and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive).
     * Otherwise return false.
     *
     * @param age
     * @return true
     * @return false
     * */
    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19 ? true : false;
    }

}
