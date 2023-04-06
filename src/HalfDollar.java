/**
 * Coin machine project
 * @author 24mebane
 * @version 03.30.2023
 */
public class HalfDollar extends Coin{
    @Override
    public double getValue() {
        return 0.5;
    }

    @Override
    public String getName() {
        return "half dollar";
    }
}
