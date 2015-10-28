package dnddiceroller;

import java.util.Random;

/**
 * A Die is a many sided object that when rolled provides a random value from
 * 1 through the number of sides on the object. Some dice are 6 sided and have
 * the numbers 1-6 on them. Some dice are 20 sided with the numbers 1-20 on them.
 * Others are called fudge dice and have the values of -1 0 or +1
 * @author Paul Scarrone
 */
public class Die {
  
    //fileds
    final private int sides;
    private int value;

/**
 * the constructor performs initial roll of the die.
 * @param numSides is the number of sides for this die.
 */
    public Die(int numSides){
               
        sides = numSides;
        roll();
}
     
 //the roll method simulates the rolling of the die.
    public void roll()
{
        //create a Random object.
        Random rand = new Random();

        //get a random value for this die.
        value = rand.nextInt(sides) +1;
}
    /**
     * allow value to be accessed by the DiceTower.
     * @return the value of variable value.
     */
        public int getValue(){
            return value;
        }
}
