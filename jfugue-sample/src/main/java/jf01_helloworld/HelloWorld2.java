package jf01_helloworld;

import org.jfugue.player.Player;

/*	Playing multiple voices, multiple instruments, rests, chords, and durations

	This example uses the Staccato 'V' command for specifing voices, 'I' for specifying instruments
	(text within brackets is looked up in a dictionary and maps to MIDI instrument numbers),
	'|' (pipe) for indicating measures (optional), durations including 'q' for quarter duration,
	'qqq' for three quarter notes (multiple durations can be listed together), and 'h' for half,
	'w' for whole, and '.' for a dotted duration; 'R' for rest, and the chords G-Major and C-Major.

	Whitespace is not significant and can be used for visually pleasing or helpful spacing.
 */

public class HelloWorld2 {

   public static void main(String[] args){

	  Player player = new Player();
	  player.play("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq   V1 I[Flute] Rw | Rw | GmajQQQ CmajQ");
   }
}
