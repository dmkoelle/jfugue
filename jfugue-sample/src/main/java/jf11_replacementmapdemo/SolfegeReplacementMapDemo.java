package jf11_replacementmapdemo;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.staccato.ReplacementMapPreprocessor;
import org.staccato.maps.SolfegeReplacementMap;

/*	Use"Replacement Maps"to Play Solfege

  	JFugue comes with a SolfegeReplacementMap,which means you can program music using
  	"Do Re Me Fa So La Ti Do."The ReplacementMapParser converts those solfege tones to
  	C D E F G A B.Using Replacement Maps,which are simply Map<String,String>,you can
  	create any kind of music in a pattern that will be converted to musical notes
  	(or whatever you put in the values of your Map).
*/

public class SolfegeReplacementMapDemo {

   public static void main(String[] args){

	  ReplacementMapPreprocessor rmp = ReplacementMapPreprocessor.getInstance();
	  rmp.setReplacementMap(new SolfegeReplacementMap())
		 .setRequireAngleBrackets(false);

	  Player player = new Player();
	  player.play(new Pattern("do re mi fa so la ti do")); // This will play "C D E F G A B"

	  // This next example brings back the brackets so durations can be added
	  rmp.setRequireAngleBrackets(true);
	  player.play(new Pattern("<Do>q <Re>q <Mi>h | <Mi>q <Fa>q <So>h | <So>q <Fa>q <Mi>h | <Mi>q <Re>q <Do>h"));
   }
}
