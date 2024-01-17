import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class DateHandlerTest {

    DateHandler testingDateHandler = new DateHandler();

    @Test
    void printFormattedDateFull(){
        OffsetDateTime objToFormat = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dateFormatted = objToFormat.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        assertEquals(dateFormatted, testingDateHandler.printFormattedDate(OffsetDateTime.parse("2002-03-01T13:00:00Z"), "full"));
    }
    @Test
    void printFormattedDateMedium(){
        OffsetDateTime objToFormat = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dateFormatted = objToFormat.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        assertEquals(dateFormatted, testingDateHandler.printFormattedDate(OffsetDateTime.parse("2002-03-01T13:00:00Z"), "medium"));
    }
    @Test
    void printFormattedDateShort(){
        OffsetDateTime objToFormat = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dateFormatted = objToFormat.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        assertEquals(dateFormatted, testingDateHandler.printFormattedDate(OffsetDateTime.parse("2002-03-01T13:00:00Z"), "short"));
    }
    @Test
    void printFormattedDateFormatoNull(){
        OffsetDateTime objToFormat = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        try{
            String result = testingDateHandler.printFormattedDate(objToFormat, null);

        } catch (NullPointerException e){
            System.out.println(e);
        }
    }
}