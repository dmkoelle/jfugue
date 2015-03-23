package jf02_patterns;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

/*	Introduction to Patterns, Part 2

	Voice and instruments for a pattern can also be set through the API.
	In JFugue, methods that would normally return 'void' instead return the object itself,
	which allows you do chain commands together, as seen in this example.
*/

public class IntroToPatterns2 {

   public static void main(String[] args){

	  Pattern p1 = new Pattern("Eq Ch. | Eq Ch. | Dq Eq Dq Cq").setVoice(0)
															   .setInstrument("Piano");
	  Pattern p2 = new Pattern("Rw     | Rw     | GmajQQQ  CmajQ").setVoice(1)
																  .setInstrument("Flute");
	  Player player = new Player();
	  player.play(p1, p2);
   }
}
