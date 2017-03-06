
import vsm.speedmeter.enterData;

/**
 * Created by exformat on 27.01.17.
 */
public class calLength
{
    public double callength() throws Exception
    {
        enterData radius = new enterData();
        double L = radius.eData() * Math.PI*2;
        L /= 100;
        return L;
    }
}
