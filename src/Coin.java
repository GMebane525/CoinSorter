/**
 * Coin machine project
 * @author 24mebane
 * @version 03.30.2023
 */
public abstract class Coin {
    public abstract double getValue();
    public abstract String getName();
    public String getPluralName(){
        //penny - pennies
        //nickel - nickels
        //dime - dimes
        // quarter - quarters
       return getName().equals("penny") ? "pennies" : getName()+"s";
    }

    public boolean equals(Object other) {
        if(other instanceof Coin){
            return this.getValue() == ((Coin)other).getValue();
        }
        return false;
    }

}
