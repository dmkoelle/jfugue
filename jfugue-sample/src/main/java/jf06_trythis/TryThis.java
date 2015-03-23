package jf06_trythis;

import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;
import org.jfugue.theory.ChordProgression;

/*	All That, in One Line of Code?

	Try this. The main line of code even fits within the 140-character limit of a tweet.
*/

public class TryThis {

   public static void main(String[] args){

	  new Player().play(new ChordProgression("I IV vi V").eachChordAs("$_i $_i Ri $_i"), new Rhythm().addLayer("..X...X...X...XO"));
   }
}
