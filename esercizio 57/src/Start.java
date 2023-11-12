import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Start {

    public static void main(String[] args) {

        String inputDateString = "2023-03-01T13:00:00Z";
        Instant instant = Instant.parse(inputDateString);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("UTC"));


        ZonedDateTime resultDateTime = zonedDateTime.plusYears(1).minusMonths(1).plusDays(7);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                .withLocale(Locale.ITALY);
        String formattedResult = resultDateTime.format(formatter);
        System.out.println("Risultato localizzato per l'Italia: " + formattedResult);
    }
}