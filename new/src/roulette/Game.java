package roulette;

import util.ConsoleReader;

/**
 * Plays a game of roulette.
 * 
 * @author Robert C. Duvall
 */
public class Game
{
  private static final String DEFAULT_NAME = "Roulette";
  private Wheel myWheel;
  public Game (){
    myWheel = new Wheel();
  }

  public String getName (){
    return DEFAULT_NAME;
  }

  public void play (Gambler player){
    int amount = ConsoleReader.promptRange("How much do you want to bet", 0, player.getBankroll());
    Bet betChoice = Bet.fromInput();

    System.out.print("Spinning ...");
    myWheel.spin();
    System.out.println("Dropped into " + myWheel.getColor().toString().toLowerCase() + " " + myWheel.getNumber());
    amount = betChoice.getPayoff(amount, myWheel);
    player.updateBankroll(amount);
  }
}
