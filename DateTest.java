public class DateTest {

    public static void main(String args[]){
        Date date = new Date(27,9,2019);
        System.out.println("Day is " + date.getDay());
        System.out.println("Month is " + date.getMonth());
        System.out.println("Year is " + date.getYear());
        date.displayDate();
        date.setDay(7);
        date.setMonth(5);
        date.setYear(2005);
        date.displayDate();
    }

}
