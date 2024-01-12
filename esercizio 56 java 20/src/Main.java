import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto OffsetDateTime dalla stringa
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Formattazione della data nel formato richiesto
        DateTimeFormatter formatoDesiderato = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        String dataFormattata = data.format(formatoDesiderato);

        // Stampa sulla console
        System.out.println(dataFormattata);
    }
}