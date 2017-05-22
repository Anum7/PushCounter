package pushCounter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pushCounterPanel extends JPanel{
	private int count;
	private JButton push;
	private JLabel label;
	
	
	public pushCounterPanel(){
		count=0;
		push= new JButton("Push Me!!");
		label = new JLabel();
		push.addActionListener(new ButtonListener());
		add(push);
		add(label);
		
		setBackground(Color.blue);
		setPreferredSize(new Dimension(300,400));
	}
	
	private class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			count++;
			label.setText("Push "+ count);
		}
	}
}