/**
 * Created by exformat on 27.01.17.
 */
public class start
{
    public static void main(String[] args) throws Exception
    {
        comparison kmh = new comparison();
        double kmH = kmh.comp();
        String lastMax = kmh.readLastMaxSpeed();
        double lastMaxSpeed = Double.parseDouble(lastMax);

        System.out.println("Max speed: " + lastMaxSpeed + " km/h: " + kmH);
    }
}
