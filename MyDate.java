import java.util.GregorianCalendar;



public class MyDate {

    // data for year, month, and day
    private int year;
    private int month;
    private int day;

    public MyDate() {

        // creating a gregorian calendar object for the current date
        GregorianCalendar calendar = new GregorianCalendar();

        //getting the current year, month, and day
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }



    public MyDate(long elapsedTime) {

        // creating a gregorian calendar object
        GregorianCalendar calendar = new GregorianCalendar();

        // setting calendar using the elapsed time
        calendar.setTimeInMillis(elapsedTime);

        // getting year, month, and day
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {

        this.year = year;
        this.month = month;
        this.day = day;
    }

    //return the year
    public int getYear() {
        return year;
    }

    //return the month
    public int getMonth() {
        return month;
    }

    //return the day
    public int getDay() {
        return day;
    }

    //setting a new date
    public void setDate(long elapsedTime) {

        // creating a gregorian calendar object
        GregorianCalendar calendar = new GregorianCalendar();

        // setting the calendar
        calendar.setTimeInMillis(elapsedTime);

        //updating the year, month, and day
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }


    
}