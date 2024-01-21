import org.junit.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testDateFormatting() {
        // Creazione di un oggetto OffsetDateTime dalla stringa
        String inputString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);

        // Chiamata al metodo di formattazione dalla classe Main
        String formattedDate = Main.formatDateTime(offsetDateTime, DateTimeFormatter.ofPattern("dd MMMM yyyy"));

        // Risultato atteso
        String expectedFormattedDate = "01 marzo 2023";

        // Verifica dei risultati
        assertEquals(expectedFormattedDate, formattedDate);
    }
}