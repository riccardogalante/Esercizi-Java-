import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Creazione di due oggetti LocalDateTime dalle stringhe
        String firstDateString = "2023-03-01T13:00:00Z";
        String secondDateString = "2024-03-01T13:00:00Z";

        LocalDateTime firstDateTime = LocalDateTime.parse(firstDateString, DateTimeFormatter.ISO_DATE_TIME);
        LocalDateTime secondDateTime = LocalDateTime.parse(secondDateString, DateTimeFormatter.ISO_DATE_TIME);

        // Verifica se la prima data è precedente alla seconda
        boolean isFirstBeforeSecond = firstDateTime.isBefore(secondDateTime);

        // Verifica se la seconda data è successiva alla prima
        boolean isSecondAfterFirst = secondDateTime.isAfter(firstDateTime);

        // Verifica se le due date sono uguali ad ora
        boolean areDatesEqualNow = firstDateTime.isEqual(LocalDateTime.now()) && secondDateTime.isEqual(LocalDateTime.now());

        // Stampa dei risultati
        System.out.println("La prima data è precedente alla seconda: " + isFirstBeforeSecond);
        System.out.println("La seconda data è successiva alla prima: " + isSecondAfterFirst);
        System.out.println("Le due date sono uguali ad ora: " + areDatesEqualNow);
    }
}