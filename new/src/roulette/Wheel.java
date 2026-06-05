package roulette;

import java.util.Random;


/**
 * Represents a roulette wheel that can be spun to get a color,
 * either red, black, or green, and a number, between 0 and 37.
 * The numbers 0 and 37 represent the roulette values 0 and 00,
 * respectively.
 * 
 * @author Robert C. Duvall
 */
public class Wheel {

  static final int RANGE_SIZE = 3;

  private static final Color[] OUR_SPOTS = {
    Color.GREEN,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.BLACK,
    Color.RED,
    Color.GREEN
  };

  private int myValue;
  private Random myRoller;

  public Wheel(){
    myValue = 0;
    myRoller = new Random();
    myRoller.setSeed(2907);
  }


  public Color getColor(){
    return OUR_SPOTS[myValue];
  }


  public int getNumber(){
    return myValue;
  }

  public void spin (){
    myValue = myRoller.nextInt(OUR_SPOTS.length);
  }
}
