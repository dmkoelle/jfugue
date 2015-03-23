package jf05_rhythms;

import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

/*	Introduction to Rhythms
	One of my favorite parts of the JFugue API is the ability to create rhythms
	in a fun and easily understandable way.The letters are mapped to percussive
	instrument sounds,like"Acoustic Snare"and"Closed Hi Hat".JFugue comes with a
	default"rhythm set",which is a Map<Character, String>with entries like this:put('O',"[BASS_DRUM]i").
*/

public class IntroToRhythms {

   public static void main(String[] args){

	  Rhythm rhythm = new Rhythm().addLayer("O..oO...O..oOO..")
								  .addLayer("..S...S...S...S.")
								  .addLayer("````````````````")
								  .addLayer("...............+");

	  new Player().play(rhythm.getPattern()
							  .repeat(2));
   }
}
