package roulette;


/**
 * Represents a Gambler simply as an amount to money to be spent.
 * 
 * @author Robert C. Duvall
 */
public class Gambler {
    private String myName;
    private int myMoney;

    public Gambler(String name, int money){
        myName = name;
        myMoney = money;
    }

    public String getName(){
        return myName;
    }

    public int getBankroll(){
        return myMoney;
    }


    public boolean isSolvent(){
        return (myMoney > 0);
    }

    public void updateBankroll(int amount){
        myMoney += amount;
    }
}
