import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Start {

    public static void main(String[] args) {

        String inputDateString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputDateString, DateTimeFormatter.ISO_OFFSET_DATE_TIME);


        String formattedDate = formatDateTime(offsetDateTime, "dd MMMM yyyy");


        System.out.println(formattedDate);
    }


    private static String formatDateTime(OffsetDateTime offsetDateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return offsetDateTime.format(formatter);
    }
}