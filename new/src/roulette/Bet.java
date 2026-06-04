package roulette;
import util.ConsoleReader;

/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */

public abstract class Bet {
  public static Bet fromInput() {
    while (true) {
      String bet = ConsoleReader.promptString("What would you like to bet on? ");
      try {
        int numBet = Integer.parseInt(bet);
        if (numBet >= 1 && numBet < 34) {
          return new NumberRangeBet(numBet);
        }
      } catch (NumberFormatException e) {
        try {
          switch (bet.toLowerCase()) {
            case "red": return new RedBet();
            case "black": return new BlackBet();
            case "odd": return new OddBet();
            case "even": return new EvenBet();
            default: break;
          }
        } catch (IllegalArgumentException ex) {
          // fall through
        }
      }
      System.out.println("Invalid bet!  Try again.");
    }
  }

  public int getPayoff(int amountBet, Wheel wheelState) {
    int amount = amountBet;
    if (matches(wheelState)) {
      System.out.println("*** Congratulations :) You win ***");
      amount *= getOdds();
    } else {
      System.out.println("*** Sorry :( You lose ***");
      amount *= -1;
    }
    return amount;
  }

  public abstract boolean matches(Wheel wheel);
  public abstract int getOdds();
}
