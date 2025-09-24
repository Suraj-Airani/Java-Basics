package date_and_time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Date: "+today);
        
        System.out.println();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");

        String formattedDate1 = today.format(formatter1);
        String formattedDate2 = today.format(formatter2);
        String formattedDate3 = today.format(formatter3);
        String formattedDate4 = today.format(formatter4);

        System.out.println("Different formats of date and time: \n"+formattedDate1+"\n"+formattedDate2+"\n"+formattedDate3+"\n"+formattedDate4);
    }
}
