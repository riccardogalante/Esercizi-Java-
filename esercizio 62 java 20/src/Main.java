import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // Creazione di un oggetto OffsetDateTime dalla stringa
        String inputString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);

        // Formattazione della data in "01 marzo 2023"
        String formattedDate = formatDateTime(offsetDateTime, DateTimeFormatter.ofPattern("dd MMMM yyyy"));

        // Stampa sulla console
        System.out.println(formattedDate);
    }

    public static String formatDateTime(OffsetDateTime offsetDateTime, DateTimeFormatter formatter) {
        return offsetDateTime.format(formatter);
    }
}