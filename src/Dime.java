/**
 * Coin machine project
 * @author 24mebane
 * @version 03.30.2023
 */
public class Dime extends Coin{

    @Override
    public double getValue() {
        return 0.1;
    }

    @Override
    public String getName() {
        return "dime";
    }
}
