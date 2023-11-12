import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Start {

    public static void main(String[] args) {

        String dateString1 = "2023-03-01T13:00:00Z";
        Instant instant1 = Instant.parse(dateString1);
        ZonedDateTime dateTime1 = ZonedDateTime.ofInstant(instant1, ZoneId.of("UTC"));


        String dateString2 = "2024-03-01T13:00:00Z";
        Instant instant2 = Instant.parse(dateString2);
        ZonedDateTime dateTime2 = ZonedDateTime.ofInstant(instant2, ZoneId.of("UTC"));


        boolean isFirstBeforeSecond = dateTime1.isBefore(dateTime2);
        boolean isSecondAfterFirst = dateTime2.isAfter(dateTime1);
        boolean areDatesEqual = dateTime1.isEqual(dateTime2);


        System.out.println("La prima data è precedente alla seconda: " + isFirstBeforeSecond);
        System.out.println("La seconda data è successiva alla prima: " + isSecondAfterFirst);
        System.out.println("Le due date sono uguali: " + areDatesEqual);
    }
}