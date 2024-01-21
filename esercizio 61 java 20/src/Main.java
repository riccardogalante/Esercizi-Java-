import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // Creazione di un oggetto OffsetDateTime dalla stringa
        String inputString = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);

        // Formattazione e stampa delle versioni FULL, MEDIUM e SHORT
        String fullFormat = formatDateTime(offsetDateTime, DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh:mm:ss a"));
        String mediumFormat = formatDateTime(offsetDateTime, DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm:ss a"));
        String shortFormat = formatDateTime(offsetDateTime, DateTimeFormatter.ofPattern("MM/dd/yy hh:mm a"));

        System.out.println("FULL Format: " + fullFormat);
        System.out.println("MEDIUM Format: " + mediumFormat);
        System.out.println("SHORT Format: " + shortFormat);
    }

    public static String formatDateTime(OffsetDateTime offsetDateTime, DateTimeFormatter formatter) {
        return offsetDateTime.format(formatter);
    }
}