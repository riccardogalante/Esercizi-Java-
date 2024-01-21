import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
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
        String dayOfWeek = offsetDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());

        // Stampa i risultati sulla console
        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek);
    }
}