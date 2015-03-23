package jf04_twelvebarblues;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.theory.ChordProgression;

import java.io.IOException;

/*	Twelve-Bar Blues in Two Lines of Code

	Twelve-bar blues uses a I-IV-V chord progression.
	But really, it's the Major 7ths that you'd like to hear...
	and if you want to play each chord in arpeggio, you need a 6th
	in there as well. But creating a I7%6-IV7%6-V7%6 chord progression is messy.
	So, this code creates a I-IV-V progression, then distributes a 7%6 across
	each chord, then creates the twelve bars, and then each chord is played
	as an arpeggio with note dynamics (note on velocity - how hard you hit the note).
	Finally, the pattern is played with an Acoustic_Bass instrument at 110 BPM.
	 With all of the method chaining, that is kinda done in one line of code.
*/

public class TwelveBarBlues {

   public static void main(String[] args) throws IOException{

	  Pattern pattern = new ChordProgression("I IV V").distribute("7%6")
													  .allChordsAs("$0 $0 $0 $0 $1 $1 $0 $0 $2 $1 $0 $0")
													  .eachChordAs("$0ia100 $1ia80 $2ia80 $3ia80 $4ia100 $3ia80 $2ia80 $1ia80")
													  .getPattern()
													  .setInstrument("Acoustic_Bass")
													  .setTempo(100);
	  new Player().play(pattern);
   }
}
