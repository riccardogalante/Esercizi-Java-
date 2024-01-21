import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // ... Rimuovi il codice originale dalla main ...
    }

    public static String manipulateDate(LocalDateTime dateTime) {
        // Aggiungi un anno
        LocalDateTime oneYearLater = dateTime.plus(1, ChronoUnit.YEARS);

        // Sottrai un mese
        LocalDateTime oneMonthBefore = oneYearLater.minus(1, ChronoUnit.MONTHS);

        // Aggiungi 7 giorni
        LocalDateTime sevenDaysLater = oneMonthBefore.plus(7, ChronoUnit.DAYS);

        // Formattazione e restituzione del risultato localizzato per l'Italia
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withLocale(Locale.ITALY);
        return sevenDaysLater.format(formatter);
    }
}