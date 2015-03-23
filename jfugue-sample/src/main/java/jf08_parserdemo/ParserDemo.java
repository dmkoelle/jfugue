package jf08_parserdemo;

import org.jfugue.midi.MidiParser;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.staccato.StaccatoParserListener;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;

/*	Connecting Any Parser to Any ParserListener

	You can use JFugue to convert between music formats.
	Most commonly,JFugue is used to turn Staccato music into MIDI sound.
	Alternatively,you can play with the MIDI,MusicXML,and LilyPond parsers
	and listeners.Or,you can easily create your own parser or listener,
	and it will instantly interoperate with the other existing formats.
	(And if you convert to Staccato,you can then play the Staccato music...and edit it!)
*/

public class ParserDemo {

   public static void main(String[] args) throws InvalidMidiDataException, IOException{

	  String fileName = "PUT A MIDI FILE HERE";
	  MidiParser parser = new MidiParser();
	  StaccatoParserListener listener = new StaccatoParserListener();

	  parser.addParserListener(listener);
	  parser.parse(MidiSystem.getSequence(new File(fileName)));

	  Pattern staccatoPattern = listener.getPattern();
	  System.out.println(staccatoPattern);

	  Player player = new Player();
	  player.play(staccatoPattern);
   }
}
