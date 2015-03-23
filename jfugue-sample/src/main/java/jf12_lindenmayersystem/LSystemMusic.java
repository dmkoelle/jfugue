package jf12_lindenmayersystem;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.staccato.ReplacementMapPreprocessor;

import java.util.HashMap;
import java.util.Map;

/*	Use"Replacement Maps"to Generate Fractal Music

  	A Lindenmayer system is a string rewriting system that can be used to create fractal shapes.
  	You can use JFugue's ReplacementMap capability to create music based on string rewrite rules!
  	 (File this one under, "I didn't intentionally create a fractal music tool,it just kinda happened.Oops.")
*/
public class LSystemMusic {

   public static void main(String[] args){

	  // Specify the transformation rules for this Lindenmayer system
	  Map rules = new HashMap() {{
		 put("Cmajw", "Cmajw Fmajw");
		 put("Fmajw", "Rw Bbmajw");
		 put("Bbmajw", "Rw Fmajw");
		 put("C5q", "C5q G5q E6q C6q");
		 put("E6q", "G6q D6q F6i C6i D6q");
		 put("G6i+D6i", "Rq Rq G6i+D6i G6i+D6i Rq");
		 put("axiom", "axiom V0 I[Flute] Rq C5q V1 I[Tubular_Bells] Rq Rq Rq G6i+D6i V2 I[Piano] Cmajw E6q " + "V3 I[Warm] E6q G6i+D6i V4 I[Voice] C5q E6q");
	  }};

	  // Set up the ReplacementMapPreprocessor to iterate 3 times
	  // and not require brackets around replacements
	  ReplacementMapPreprocessor rmp = ReplacementMapPreprocessor.getInstance();
	  rmp.setReplacementMap(rules);
	  rmp.setIterations(4);
	  rmp.setRequireAngleBrackets(false);

	  // Create a Pattern that contains the L-System axiom
	  Pattern axiom = new Pattern("T120 " + "V0 I[Flute] Rq C5q " + "V1 I[Tubular_Bells] Rq Rq Rq G6i+D6i " + "V2 I[Piano] Cmajw E6q " + "V3 I[Warm] E6q G6i+D6i " + "V4 I[Voice] C5q E6q");

	  Player player = new Player();
	  System.out.println(rmp.preprocess(axiom.toString(), null));
	  player.play(axiom);
   }
}
