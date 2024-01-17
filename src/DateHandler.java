import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateHandler {

    public String printFormattedDate(OffsetDateTime dateTimeToFormat, String formato) throws NullPointerException{
        if (formato == null) {
            throw new NullPointerException();
        }
        String dateFormatted = "";

        switch (formato.toLowerCase()) {
            case "full":
                dateFormatted = dateTimeToFormat.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
                return dateFormatted;
            case "medium":
                dateFormatted = dateTimeToFormat.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
                return dateFormatted;
            case "short":
                dateFormatted = dateTimeToFormat.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
                return dateFormatted;
            default:
                return "error";
        }
    }

}