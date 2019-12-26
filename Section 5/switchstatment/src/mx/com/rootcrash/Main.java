package mx.com.rootcrash;

public class Main {

    public static void main(String[] args) {
//        int switchValue = 1;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            default:
//                System.out.println("Was not a or 2");
//                break;
//        }
//
//        char charValue = 'A';
//        switch (charValue) {
//            case 'A':
//                System.out.println("A was found");
//                break;
//            case 'B':
//                System.out.println("E was found");
//                break;
//            case 'C': case 'D': case 'E':
//                System.out.println(charValue + " was found");
//                break;
//            default:
//                System.out.println("Could not find A, B, C, D or E");
//                break;
//        }

      boolean data = isLeapYear(2012);
        System.out.println(data);
        System.out.println(getDaysInMonth(2, 2021));

    }

    /**
     * Print day of the week
     * <p>
     * Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
     * The method should not return any value (hint: void)
     *
     * @param day
     */
    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    /**
     * Number in word
     * <p>
     * Write a method called printNumberInWord. The method has one parameter number which
     * is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER"
     * if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers.
     *
     * @param number
     */
    private static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    /**
     * Number of days in month
     * <p>
     * Write a method isLeapYear with a parameter of type int named year. The parameter needs to be greater
     * than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.
     * <p>
     * Otherwise, if it is in the valid range, calculate if the year is a leap year and return
     * true if it is, otherwise return false.
     * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
     *
     * @param year
     * @return true
     * @return false
     */
    private static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) return false;
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    /**
     *
     * Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.
     * If parameter month is < 1 or > 12 return -1. ​
     * If parameter year is < 1 or > 9999 then return -1.
     *
     * This method needs to return the number of days in the month. Be careful about leap years
     * they have 29 days in month 2 (February).
     * You should check if the year is a leap year using the method isLeapYear described above.
     *
     * @param month
     * @param year
     * @return
     */
    private static int getDaysInMonth(int month, int year) {

        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) return -1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) return 29;
                return 28;
            default:
                return 30;
        }

    }
}
