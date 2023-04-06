/**
 * Coin machine project
 * @author 24mebane
 * @version 03.30.2023
 */
public class Nickel extends Coin{
    @Override
    public double getValue() {
        return 0.05;
    }

    @Override
    public String getName() {
        return "nickel";
    }
}
