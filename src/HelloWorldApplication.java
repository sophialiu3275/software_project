import javax.swing.*;
public class HelloWorldApplication {

	public static void main(String[] args) {
//student name: I-Chia liu
		JFrame frame = new JFrame("Hello World");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       JButton button = new JButton("Press");
	       frame.getContentPane().add(button); // Adds Button to content pane of frame
	       frame.setVisible(true);

	}

}
