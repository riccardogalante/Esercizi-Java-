import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto LocalDateTime dalla stringa
        String inputString = "2023-03-01T13:00:00Z";
        LocalDateTime dateTime = LocalDateTime.parse(inputString, DateTimeFormatter.ISO_DATE_TIME);

        // Aggiungi un anno
        LocalDateTime oneYearLater = dateTime.plus(1, ChronoUnit.YEARS);

        // Sottrai un mese
        LocalDateTime oneMonthBefore = oneYearLater.minus(1, ChronoUnit.MONTHS);

        // Aggiungi 7 giorni
        LocalDateTime sevenDaysLater = oneMonthBefore.plus(7, ChronoUnit.DAYS);

        // Formattazione e stampa localizzata per l'Italia
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withLocale(Locale.ITALY);
        String formattedResult = sevenDaysLater.format(formatter);

        System.out.println("Risultato localizzato per l'Italia: " + formattedResult);
    }
}