package roulette;

public class RedBet extends Bet {
    public boolean matches(Wheel wheel) { return wheel.getColor() == Color.RED; }
    public int getOdds() { return 1; }
}
