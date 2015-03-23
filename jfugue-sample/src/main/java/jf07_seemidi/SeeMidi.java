package jf07_seemidi;

import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;

/*	See the Contents of a MIDI File in Human-Readable and Machine-Parseable Staccato Format

	Want to see the music in your MIDI file?Of course,you could load it in a sheet music tool.
	Here's how you can load it with JFugue. You'll get a Pattern of your music,which you can
	then pick apart in interesting ways(for example,count how many"C"notes there are...
	that's coming up in a few examples)
*/

public class SeeMidi {

   public static void main(String[] args) throws IOException, InvalidMidiDataException{

	  String fileName = "PUT YOUR MIDI FILENAME HERE";
	  Pattern pattern = MidiFileManager.loadPatternFromMidi(new File(fileName));
	  System.out.println(pattern);
   }
}
