package roulette;
public class NumberRangeBet extends Bet {
    private static final int RANGE_SIZE = 3;
    private int number;
    public NumberRangeBet(int number) { this.number = number; }
    public boolean matches(Wheel wheel) { 
        return number <= wheel.getNumber() && wheel.getNumber() < number + RANGE_SIZE; 
    }
    public int getOdds() { return 11; }
}
