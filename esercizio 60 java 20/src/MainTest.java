import org.junit.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testDateManipulation() {
        // Creazione di un oggetto LocalDateTime dalla stringa
        String inputString = "2023-03-01T13:00:00Z";
        LocalDateTime dateTime = LocalDateTime.parse(inputString, DateTimeFormatter.ISO_DATE_TIME);

        // Chiamata al metodo di manipolazione della data dalla classe Main
        String actualFormattedResult = Main.manipulateDate(dateTime);

        // Formattazione e confronto con il risultato atteso
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withLocale(Locale.ITALY);
        String expectedFormattedResult = dateTime.plus(1, ChronoUnit.YEARS)
                .minus(1, ChronoUnit.MONTHS)
                .plus(7, ChronoUnit.DAYS)
                .format(formatter);

        assertEquals(expectedFormattedResult, actualFormattedResult);
    }
}