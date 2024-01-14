package academy.devdojo.javaoneforall.javacore.Rdate.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();// class date works with milliseconds since 1 january of 1970
        // most of your methods are deprecated
        // only use Class date and calendar when you are working with legacy system
        // always prefer to use the class time(java.util)
        date.setTime(date.getTime() + 3_600_000);// add 1 hour to the now time
        System.out.println(date);
    }
}
