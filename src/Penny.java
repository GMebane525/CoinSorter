/**
 * Coin machine project
 * @author 24mebane
 * @version 03.30.2023
 */
public class Penny extends Coin{
    @Override
    public double getValue() {
        return 0.01;
    }

    @Override
    public String getName() {
        return "penny";
    }
}