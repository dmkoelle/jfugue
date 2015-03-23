package jf11_replacementmapdemo;

import org.jfugue.player.Player;
import org.staccato.ReplacementMapPreprocessor;
import org.staccato.maps.CarnaticReplacementMap;

/*	Use "Replacement Maps" to Create Carnatic Music

  	JFugue's ReplacementMap capability lets you use your own symbols
  	in a music string. JFugue comes with a CarnaticReplacementMap
  	that maps Carnatic notes to microtone frequencies.
*/

public class CarnaticReplacementMapDemo {

   public static void main(String[] args){

	  ReplacementMapPreprocessor.getInstance()
								.setReplacementMap(new CarnaticReplacementMap());

	  Player player = new Player();
	  player.play("<S> <R1> <R2> <R3> <R4>");
   }
}
