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

        printDayOfTheWeek(12);

    }

    /**
     * Print day of the week
     *
     * Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
     * The method should not return any value (hint: void)
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
}
