import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui3C implements ActionListener {
	JFrame frame;
	
	public static void main (String[] args) {
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Change colors");
		button.addActionListener(this);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
	}
}

class MyDrawPanel extends JPanel {
	// Use this paint component to make the color change when button pressed
	/* public void paintComponent(Graphics g) {
		g.fillRect(0, 0, this.getWidth(), this.getHeight() );
		
		// int red = (int) (Math.random() * 255);
		int red = 0;
		int green = (int) (Math.random() * 255);
		// int green = 0;
		int blue = (int) (Math.random() * 255);
		
		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillOval(30, 30, 150, 150);
		
	} */
	
	// Use this paint component to make a blue to orange gradient
	// Button press will do nothing
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		GradientPaint gradient = new GradientPaint(30, 30, Color.blue, 150, 150, Color.orange);
		
		g2d.setPaint(gradient);
		
		g2d.fillOval(30, 30, 150, 150);
		
	}
	
}