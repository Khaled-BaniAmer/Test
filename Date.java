public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //setters
    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //getters
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void displayDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
}
