import org.junit.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testDateFormatting() {
        // Creazione di un oggetto OffsetDateTime dalla stringa
        String inputString = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);

        // Chiamata al metodo di formattazione dalla classe Main
        String fullFormat = Main.formatDateTime(offsetDateTime, DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh:mm:ss a"));
        String mediumFormat = Main.formatDateTime(offsetDateTime, DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm:ss a"));
        String shortFormat = Main.formatDateTime(offsetDateTime, DateTimeFormatter.ofPattern("MM/dd/yy hh:mm a"));

        // Resultati attesi
        String expectedFullFormat = "venerdì, marzo 01, 2002 01:00:00 PM";
        String expectedMediumFormat = "mar 01, 2002 01:00:00 PM";
        String expectedShortFormat = "03/01/02 01:00 PM";

        // Verifica dei risultati
        assertEquals(expectedFullFormat, fullFormat);
        assertEquals(expectedMediumFormat, mediumFormat);
        assertEquals(expectedShortFormat, shortFormat);
    }
}