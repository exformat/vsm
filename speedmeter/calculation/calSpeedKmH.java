
/**
 * Created by exformat on 27.01.17.
 */
public class calSpeedKmH
{
    public double calSpeedkmH() throws Exception
    {
        calSpeedMs ms = new calSpeedMs();
        double kmH = ms.calSpeedms()*3600/1000;
        return kmH;
    }


}
