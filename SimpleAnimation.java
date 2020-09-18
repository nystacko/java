import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
	int x = 10;
	int y = 10;
	
	public static void main (String[] args) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		for (int i = 0; i < 250; i++) {
			x += 8;
			y += 8;
			
			drawPanel.repaint();
			try {
				Thread.sleep(50);
			} catch(Exception ex) { }
		} // Close for loop
		
	} // Close go method

	class MyDrawPanel extends JPanel {

		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0,0, this.getWidth(), this.getHeight() );
			
			g.setColor(Color.red);
			g.fillOval(x, y, 40, 40);
		}
	}
}