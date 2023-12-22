package academy.devdojo.javaoneforall.introduction.content;

public class Class05ConditionalStatements05 {
    public static void main(String[] args) {

        byte day = -1;
        String dayOfTheWeek = "";
        /*
         * if (day == 1) {
         * dayOfTheWeek = "Sunday";
         * }
         * else if (day == 2) {
         * dayOfTheWeek = "Monday";
         * }
         * else if (day == 3) {
         * dayOfTheWeek = "Tuesday";
         * }
         * else if (day == 4) {
         * dayOfTheWeek = "Wednesday";
         * }
         * else if (day == 5) {
         * dayOfTheWeek = "Thursday";
         * }
         * else if (day == 6) {
         * dayOfTheWeek = "Friday";
         * }
         * else if (day == 7) {
         * dayOfTheWeek = "Saturday";
         * }
         * else{
         * dayOfTheWeek = "VALUE INVALID";
         * }
         */
        // So that the code stil more clean, already exist in java one structure known
        // by switch
        // this structure required(and only works with) data types iterables like (char,
        // int, byte, short, enum, String)
        switch (day) {
            case 1:
                dayOfTheWeek = "Sunday";
                break; // the break stament is necessary because the behavior of the swith case is
                       // execute everything after the case be found out, even though the
                       // case is matched
            case 2:
                dayOfTheWeek = "Monday";
                break;
            case 3:
                dayOfTheWeek = "Tuesday";
                break;
            case 4:
                dayOfTheWeek = "Wednesday";
                break;
            case 5:
                dayOfTheWeek = "Thursday";
                break;
            case 6:
                dayOfTheWeek = "Friday";
                break;
            case 7:
                dayOfTheWeek = "Saturday";
                break;
            default: // default is the else that own a switch case structure
                     // this is only executed if anyone of the case match
                dayOfTheWeek = "INVALID VALUE";
                break;
        }
        System.out.println(dayOfTheWeek);

        char gender = 'F';

        switch (gender) {
            case 'M':
                System.out.println("Sex is Male");
                break;
            case 'F':
                System.out.println("Sex is Female");
                break;
            default:
                System.out.println("Sex is not female and not male");
                break;
        }
    }
}
