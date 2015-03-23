package jf05_rhythms;

import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

/*	Advanced Rhythms

	Through the Rhythm API, you can specify a variety of alternate layers that
	occur once or recur regularly. You can even create your own "RhythmAltLayerProvider"
	if you'd like to create a new behavior that does not already exist in the Rhythm API.
*/

public class AdvancedRhythms {

   public static void main(String[] args){

	  Rhythm rhythm = new Rhythm() //
		.addLayer("O..oO...O..oOO..") // This is Layer 0
		.addLayer("..S...S...S...S.")
		.addLayer("````````````````").addLayer("...............+") // This is Layer 3
		.addOneTimeAltLayer(3, 3, "...+...+...+...+") // Replace Layer 3 with this string on the 4th (count from 0) measure
		.setLength(4); // Set the length of the rhythm to 4 measures

	  new Player().play(rhythm.getPattern()
							  .repeat(2)); // Play 2 instances of the 4-measure-long rhythm
   }
}
