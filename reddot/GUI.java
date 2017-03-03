import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class GUI extends JFrame{
	DisplayArea newD;
	public GUI(){
		setLayout( new GridBagLayout());
		super.setTitle("Lab04: move it");
		newD = new DisplayArea();
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 500;
		c.ipadx = 500;  
		c.gridx = 0;
		c.gridy = 0;
		JPanel buContainer = new JPanel();//button panel
		buContainer.setBackground(Color.WHITE);

		GridBagConstraints buCon = new GridBagConstraints();//button panel constraints
		buCon.gridx = 0;
		buCon.gridy = 1;

		JButton buUp = new JButton("Up");//buttons
		JButton buDown = new JButton("Down");
		JButton buLeft = new JButton("Left");
		JButton buRight = new JButton("Right");
		buContainer.add(buUp);//add buttons to panel
		buContainer.add(buDown);
		buContainer.add(buLeft);
		buContainer.add(buRight);

		buUp.addActionListener(newD);
		buDown.addActionListener(newD);
		buLeft.addActionListener(newD);
		buRight.addActionListener(newD);

		String[]colors;
		colors = new String[] { "red", "black", "blue", "green", "yellow" };
		JComboBox j = new JComboBox(colors);
		j.addActionListener(newD);
		buContainer.add(j);

		JPanel radioContainer = new JPanel();
		JRadioButton square = new JRadioButton("square");
		square.addActionListener(newD);
		radioContainer.add(square);

		JRadioButton circle = new JRadioButton("circle", true);
		circle.addActionListener(newD);
		radioContainer.add(circle);
		GridBagConstraints rCon = new GridBagConstraints();//button panel constraints
		rCon.gridx = 1;
		rCon.gridy = 1;

		add(newD, c);//add display area to frame
		add(buContainer, buCon);//add button panel to frame
		add(radioContainer, rCon);
		setResizable(false); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 700);
		pack();
		setVisible(true);
	}
	public static void main(String[] args){
		GUI g =  new GUI();

		
	}
}