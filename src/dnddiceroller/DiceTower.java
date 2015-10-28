package dnddiceroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Dice Tower.
 * A Dice Tower is a tool used by serious gamers use to roll many dice at once.
 * It looks like this https://www.miniaturescenery.com/Images/PortableDiceTowerLarge.jpg
 * An instance of a dice tower is defined by the number panels it contains to help
 * provide a more regular distribution of die values. The die bounce from panel to
 * panel until they exit the dice tower at the bottom tray.
 * A dice tower will accept a collection of dice and reports their results when
 * they reach the tray at the bottom
 * @author Paul Scarrone
 */
public class DiceTower {
   
  //fields
  final int PANEL_COUNT = 3;
  List<Die> dice;
  int trayValue = 0;

 
   //constructors accept values for fields. 
    public DiceTower() {
	this.dice = new ArrayList();
  }
  /** 
   * @param dice 
   */
  
  public DiceTower(List dice) {
	this.dice = dice;
  }
  
  /**
   * accessors return values to fields.
   * @return the value of trayValue.
   */
  
  public int getTrayValue(){
      return trayValue;
  }
  
  //dropDice method simulates die being dropped into a dice tower.
  public void dropDice(){
      int i = 0;
      for(Die die : dice){
          
         for(int num = 0; num < PANEL_COUNT; num++){
             dice.get(i).roll();
         } 
         
         //get value of dice in dice tower tray at exit
         trayValue += dice.get(i).getValue();
            i++;
      }
      
  }
}
