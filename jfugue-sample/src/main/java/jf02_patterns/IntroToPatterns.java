package jf02_patterns;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

/*	Introduction to Patterns

	Patterns are one of the fundamental units of music in JFugue. They can be manipulated in musically interesting ways.
*/

public class IntroToPatterns {

   public static void main(String[] args){

	  Pattern p1 = new Pattern("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq");
	  Pattern p2 = new Pattern("V1 I[Flute] Rw     | Rw     | GmajQQQ  CmajQ");

	  Player player = new Player();
	  player.play(p1, p2);
   }
}
