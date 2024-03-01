import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto OffsetDateTime dalla stringa
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        // Formattazione della data nelle varie versioni
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy h:mm a", Locale.ENGLISH);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofPattern("MMM d, yyyy h:mm a", Locale.ENGLISH);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("M/d/yy h:mm a", Locale.ENGLISH);

        String fullFormattedDate = date.format(fullFormatter);
        String mediumFormattedDate = date.format(mediumFormatter);
        String shortFormattedDate = date.format(shortFormatter);

        // Stampa delle varie versioni
        System.out.println("Full Format: " + fullFormattedDate);
        System.out.println("Medium Format: " + mediumFormattedDate);
        System.out.println("Short Format: " + shortFormattedDate);
    }
}