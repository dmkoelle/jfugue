package jf03_chordprogressions;

import org.jfugue.player.Player;
import org.jfugue.theory.Chord;
import org.jfugue.theory.ChordProgression;
import org.jfugue.theory.Note;

/*	Introduction to Chord Progressions

	It's easy to create a Chord Progression in JFugue. You can then play it,
	or you can see the notes that comprise the any of the chords in the progression.
*/

public class IntroToChordProgressions {

   public static void main(String[] args){

	  ChordProgression cp = new ChordProgression("I IV V");

	  Chord[] chords = cp.setKey("C")
						 .getChords();

	  for(Chord chord : chords){
		 System.out.print("Chord " + chord + " has these notes: ");
		 Note[] notes = chord.getNotes();

		 for(Note note : notes){
			System.out.print(note + " ");
		 }
		 System.out.println();
	  }

	  Player player = new Player();
	  player.play(cp);
   }
}
