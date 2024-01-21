import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Creazione di un oggetto LocalDateTime dalla stringa
        String inputString = "2023-03-01T13:00:00Z";
        LocalDateTime dateTime = LocalDateTime.parse(inputString, DateTimeFormatter.ISO_DATE_TIME);

        // Chiamata al metodo di manipolazione della data
        String formattedResult = manipulateDate(dateTime);

        // Stampa il risultato localizzato per l'Italia
        System.out.println("Risultato localizzato per l'Italia: " + formattedResult);
    }

    public static String manipulateDate(LocalDateTime dateTime) {
        // Aggiungi un anno
        LocalDateTime oneYearLater = dateTime.plus(1, ChronoUnit.YEARS);

        // Sottrai un mese
        LocalDateTime oneMonthBefore = oneYearLater.minus(1, ChronoUnit.MONTHS);

        // Aggiungi 7 giorni
        LocalDateTime sevenDaysLater = oneMonthBefore.plus(7, ChronoUnit.DAYS);

        // Formattazione e restituzione del risultato localizzato per l'Italia
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss", Locale.ITALY);
        return sevenDaysLater.format(formatter);
    }
}