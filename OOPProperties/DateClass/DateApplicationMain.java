package DateClass;

public class DateApplicationMain {
    public static void main(String[] args) {
        DATE dt1 = new DATE(12, 07, 2002);
        DATE dt2 = new DATE(25, 07, 2005);
        if (dt1.leapchk() == false)
            System.out.println("It is not a leap year");
        else
            System.out.println("It is a leap year");
        System.out.println(dt1.monthName());
        dt1.Dispdate();
        dt2.longformat();
        System.out.println(dt1.equals(dt2));
        System.out.println(dt1.compareTo(dt2));
    }
}