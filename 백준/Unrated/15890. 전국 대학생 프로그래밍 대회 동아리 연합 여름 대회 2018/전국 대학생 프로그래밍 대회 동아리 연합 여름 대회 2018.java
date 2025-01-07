import java.time.*;
import java.time.format.DateTimeFormatter;
class Main{
    public static void main(String args[]){
        LocalDate date = LocalDate.of(2018, 7, 29);
        String formattedDate = date.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        
        System.out.println(formattedDate);
    }
}