import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto OffsetDateTime dalla stringa
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        // Formattazione della data nelle varie versioni
        DateTimeFormatter formatoCompleto = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy HH:mm", Locale.ITALIAN);
        DateTimeFormatter formatoMedio = DateTimeFormatter.ofPattern("d MMM yyyy HH:mm", Locale.ITALIAN);
        DateTimeFormatter formatoBreve = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm", Locale.ITALIAN);

        String dataFormatoCompleto = data.format(formatoCompleto);
        String dataFormatoMedio = data.format(formatoMedio);
        String dataFormatoBreve = data.format(formatoBreve);

        // Stampa delle varie versioni
        System.out.println("Formato Completo: " + dataFormatoCompleto);
        System.out.println("Formato Medio: " + dataFormatoMedio);
        System.out.println("Formato Breve: " + dataFormatoBreve);
    }
}