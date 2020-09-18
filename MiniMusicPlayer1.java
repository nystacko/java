import javax.sound.midi.*;

public class MiniMusicPlayer1 {

	public static void main(String[] args) {
	
		try {
		
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			for (int i = 24; i < 100; i += 4) {
				
				track.add(makeEvent(144, 5, i, 120, i) );
				track.add(makeEvent(128, 5, i, 120, i + 2) );
				// 144 is Note ON
				// 128 is Note OFF
				// 2nd Argument is channel (instrument) number, 0 to 15
				// 3rd Argument is note, 0 to 127
				// 4th Argument is velocity (loudness), 0 to 127
				// 5th Argument is time stamp
			}
			
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(120);
			sequencer.start();
			
		} catch (Exception ex) {ex.printStackTrace();}
	} // Close main
	
	public static MidiEvent makeEvent (int comd, int chan, int one, int two, int tick) {
		
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage ();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent (a, tick);
		} catch (Exception e) { }
		return event;
	} // Close makeEvent

} // Close Music Player