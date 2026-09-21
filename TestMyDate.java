public class TestMyDate {

    public static void main(String[] args) {

        //creating a mydate object for the current date
        MyDate date1 = new MyDate();

        // creating a mydate object using the specified elapsed time
        MyDate date2 = new MyDate(34355555133101L);

        // displaying the first date
        System.out.println("Date 1:");
        System.out.println("Year: " + date1.getYear());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Day: " + date1.getDay());

        // displaying the second date
        System.out.println("\nDate 2:");
        System.out.println("Year: " + date2.getYear());
        System.out.println("Month: " + date2.getMonth());
        System.out.println("Day: " + date2.getDay());
 
 
    }


}



