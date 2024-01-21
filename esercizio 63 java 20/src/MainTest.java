import org.junit.Test;
import java.time.OffsetDateTime;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testDateInfo() {
        // Creazione di un oggetto OffsetDateTime dalla stringa
        String inputString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);

        // Ottieni l'anno
        int year = offsetDateTime.getYear();

        // Ottieni il mese
        int month = offsetDateTime.getMonthValue();

        // Ottieni il giorno
        int day = offsetDateTime.getDayOfMonth();

        // Ottieni il giorno della settimana
        String dayOfWeek = offsetDateTime.getDayOfWeek().name();

        // Resultati attesi
        int expectedYear = 2023;
        int expectedMonth = 3;
        int expectedDay = 1;
        String expectedDayOfWeek = "WEDNESDAY";

        // Verifica dei risultati
        assertEquals(expectedYear, year);
        assertEquals(expectedMonth, month);
        assertEquals(expectedDay, day);
        assertEquals(expectedDayOfWeek, dayOfWeek);
    }
}