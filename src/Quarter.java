/**
 * Coin machine project
 * @author 24mebane
 * @version 03.30.2023
 */
public class Quarter extends Coin{

    @Override
    public double getValue() {
        return 0.25;
    }

    @Override
    public String getName() {
        return "quarter";
    }
}
