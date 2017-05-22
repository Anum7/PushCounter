package pushCounter;

import javax.swing.JFrame;

public class pushCounter {
	
	public static void main(String[]args){
		JFrame frame = new JFrame("Push Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pushCounterPanel panel = new pushCounterPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}


