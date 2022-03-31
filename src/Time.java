import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy(HH:mm:ss)");
    private final StringBuilder time = new StringBuilder(dateFormat.format(calendar.getTime()));

    public StringBuilder getTime() {
        return time;
    }

    public int getTimeLength(StringBuilder time) {
        return time.length();
    }
}
