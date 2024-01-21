import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto LocalDateTime dalla stringa
        String inputString = "2023-03-01T13:00:00Z";
        LocalDateTime dateTime = LocalDateTime.parse(inputString, DateTimeFormatter.ISO_DATE_TIME);

        // Ottenere l'anno, il mese e il giorno
        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();

        // Ottenere il giorno della settimana
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();

        // Stampa dei risultati sulla console
        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek);
    }
}