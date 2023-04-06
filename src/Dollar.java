/**
 * Coin machine project
 * @author 24mebane
 * @version 03.30.2023
 */
public class Dollar extends Coin{
    @Override
    public double getValue() {
        return 1.00;
    }

    @Override
    public String getName() {
        return "dollar";
    }
}
