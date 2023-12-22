package academy.devdojo.javaoneforall.introduction.content;

public class Class05ConditionalStatements06 {
    // Using switch, print if the day is bussines day or weekend
    // Giving the numbers 1 - 7, 1 being sunday
    // sunday, monday, tuesday, wednesday, thursday, friday, saturday
    // 1 2 3 4 5 6 7
    public static void main(String[] args) {
        int dayOfTheWeek = 7; // 1-7
        switch (dayOfTheWeek) {
            case 1:
            case 7:
                System.out.println("Time to rest");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Keep Working");
                break;
            default:
                System.out.println("It's not a day of the week");
                break;
        }
    }
}
