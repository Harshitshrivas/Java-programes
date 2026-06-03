import java.time.LocalDate;
import java.time.LocalDateTime;

public class dateandtime {
    public static void main(String[] args) {
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);
        LocalDateTime specificDateTime = LocalDateTime.of(2022, 12, 25, 10, 30);
        System.out.println("Specific date and time: " + specificDateTime);
        LocalDate day = LocalDate.now();
        System.out.println("Current date: " + day.plusDays(10));

    }
}
