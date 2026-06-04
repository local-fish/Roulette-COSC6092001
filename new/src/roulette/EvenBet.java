package roulette;
public class EvenBet extends Bet {
    public boolean matches(Wheel wheel) { return wheel.getNumber() % 2 == 0; }
    public int getOdds() { return 1; }
}
