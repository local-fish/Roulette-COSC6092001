package roulette;

public class BlackBet extends Bet {
    public boolean matches(Wheel wheel) { return wheel.getColor() == Color.BLACK; }
    public int getOdds() { return 1; }
}
