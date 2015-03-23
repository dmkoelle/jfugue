package jf03_chordprogressions;

import org.jfugue.player.Player;
import org.jfugue.theory.ChordProgression;

/*	Advanced Chord Progressions

	You can do some pretty cool things with chord progressions.
	The methods below use $ to indicate an index into either the chord progression
	(in which case, the index points to the nth chord), or a specific chord
	(in which case the index points to the nth note of the chord). Underscore means
	"the whole thing". If you change the indexes, make sure you don't introduce an
	ArrayOutOfBoundsException (for example, a major chord has only three notes, so
	trying to get the 4th index, $3 (remember that this is zero-based), would cause an error).
*/

public class AdvancedChordProgressions {

   public static void main(String[] args){

	  ChordProgression cp = new ChordProgression("I IV V");

	  Player player = new Player();
	  player.play(cp.eachChordAs("$0q $1q $2q Rq"));

	  player.play(cp.allChordsAs("$0q $0q $0q $0q $1q $1q $2q $0q"));

	  player.play(cp.allChordsAs("$0 $0 $0 $0 $1 $1 $2 $0")
					.eachChordAs("V0 $0s $1s $2s Rs V1 $_q"));
   }
}
