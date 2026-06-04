package roulette;

public class OddBet extends Bet {
    public boolean matches(Wheel wheel) { return wheel.getNumber() % 2 == 1; }
    public int getOdds() { return 1; }
}
