
import java.text.DecimalFormat;
import java.util.Locale;

/**
 * Created by exformat on 27.01.17.
 */
public class formatDouble
{
    public String formatD() throws Exception
    {
        calSpeedKmH kmh  = new calSpeedKmH();
        double speed = kmh.calSpeedkmH();

        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(speed);

        return format;
    }
}
