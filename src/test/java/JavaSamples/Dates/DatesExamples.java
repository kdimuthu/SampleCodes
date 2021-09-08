package JavaSamples.Dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class DatesExamples {
    public static void main(String []args) {

        //Get the current date & Time
        Date today = new Date();
        System.out.println("Current Date is :"+today);
        //Get the formatted current date for the given format with AM PM
        SimpleDateFormat format = new SimpleDateFormat("MMMM d, yyyy h:mm aa");
        //September 1, 2021 3:21 PM
        Date now = new Date();
        String strDate = format.format(now);
        System.out.println("Formatted Current date is "+strDate);
        Date todayInDifferentWay = Calendar.getInstance().getTime();
        System.out.println("Current Date is(same date in using a different way :"+todayInDifferentWay);

        //Get the date without time
        LocalDate.now();
        System.out.println("Local Date is (Date Without Time) :"+LocalDate.now());

        //Get the time without time
        LocalTime.now();
        System.out.println("Local Time is :"+LocalTime.now());

        //Get the end date of current month
        LocalDate EndDateOfCurrentMonthBeforeFormat=LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("End Date of Current Month is :"+EndDateOfCurrentMonthBeforeFormat);

        //Change the Format the date
        String EndDateOfCurrentMonth = EndDateOfCurrentMonthBeforeFormat.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Month End Date after formatted :"+EndDateOfCurrentMonth);

        //How to add a month(30 days) to current date
        LocalDate day=LocalDate.now().plusMonths(1);
        System.out.println("Add a month to current date :"+day);

    }
}
