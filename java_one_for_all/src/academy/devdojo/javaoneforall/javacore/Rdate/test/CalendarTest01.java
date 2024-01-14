package academy.devdojo.javaoneforall.javacore.Rdate.test;

import java.util.Calendar;// class calendar is a abstract class, so you will use one of the your subclasses
import java.util.Date;
// for get the power of your methods
import java.util.GregorianCalendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Sunday is the first day of the week");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

       calendar.add(Calendar.DAY_OF_MONTH, 1);// method add trade the total Date if any field cause the pass of day or
                                               // month or year
        calendar.roll(Calendar.DAY_OF_MONTH, 30);// method roll don't trade the total date, it's still in the same month
                                                // or day or year even though the quantity be more than the capacity of
                                                // one day year or month
        calendar.add(Calendar.HOUR, 18);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
