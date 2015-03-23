package jf08_parserdemo;

import org.jfugue.midi.MidiParser;
import org.jfugue.parser.ParserListenerAdapter;
import org.jfugue.theory.Note;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;

/*	Create a Listener to Find Out About Music

	You can create a ParserListener to listen for any musical event
	that any parser is parsing. Here, we'll create a simple tool that
	counts how many "C" notes (of any octave) are played in any song.
*/

public class ParserDemo2 {

   public static void main(String[] args) throws InvalidMidiDataException, IOException{

	  String fileName = "PUT A MIDI FILE HERE";
	  MidiParser parser = new MidiParser(); // Remember, you can use any Parser!
	  MyParserListener listener = new MyParserListener();

	  parser.addParserListener(listener);
	  parser.parse(MidiSystem.getSequence(new File(fileName)));

	  System.out.println("There are " + listener.counter + " 'C' notes in this music.");
   }
}

class MyParserListener extends ParserListenerAdapter {

   public int counter;

   @Override
   public void onNoteParsed(Note note){
	  // A "C" note is in the 0th position of an octave
	  if(note.getPositionInOctave() == 0){
		 counter++;
	  }
   }
}
