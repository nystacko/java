import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener {

	public static void main(String[] args) {
		MiniMusicPlayer2 mini = new MiniMusicPlayer2();
		mini.go();
	}
	
	public void go() {
		try {
		
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			int[] eventsIWant = {127};
			sequencer.addControllerEventListener(this, eventsIWant);
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			for (int i = 5; i < 60; i += 4) {
				
				track.add(makeEvent(144, 1, i, 100, i));
				track.add(makeEvent(176, 1, 127, 0, i)); // For controller event only
				track.add(makeEvent(128, 1, i, 100, i + 2));
				// 144 is Note ON
				// 128 is Note OFF
				// 2nd Argument is channel (instrument) number, 0 to 15
				// 3rd Argument is note, 0 to 127
				// 4th Argument is velocity (loudness), 0 to 127
				// 5th Argument is time stamp
			}
			
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
			
		} catch (Exception ex) {ex.printStackTrace();}
	} // Close go
	
	public void controlChange(ShortMessage event) {
		System.out.println("la");
	}
	
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