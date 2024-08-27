package exercises.POO.Class02;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if ((day > 0 && day < 32) && (month > 0 && month < 13) && year > 0) {
            this.month = month;
            this.day = day;
            this.year = year;
        }
    }

    public void setDay(int day) {
        if (day > 0 && day < 32) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month > 0 && month < 13) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void displayDate() {
        System.out.println("The date is: " + this.day + "/" + this.month + "/" + this.year);
    }
}
