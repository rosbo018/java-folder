import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicalView extends JFrame implements View {
	private JLabel input;
	private Timer model;
	public GraphicalView (Timer model, Controller controller) {
		setLayout (new GridLayout(2, 3));
		this.model = model;
        
        //you code here
        JButton incHour = new JButton("hour++");
        JButton incMin = new JButton("Min++");	
        JButton incSec = new JButton("Sec++");

        JButton decHour = new JButton("hour--");
        JButton decMin = new JButton("Min--");
        JButton decSec = new JButton("Sec--");
        incHour.addActionListener(controller);
        incMin.addActionListener(controller); 
        incSec.addActionListener(controller);

        decHour.addActionListener(controller);
        decMin.addActionListener(controller);
        decSec.addActionListener(controller);

        add(incHour);
        add(incMin);
        add(incSec);

        add(decHour);
        add(decMin);
        add(decSec);
        input = new JLabel();
       	add(input);


		
		
		//setup
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 100);

		//display the window
		setVisible(true);
	}
	public void update () {
	input.setText(model.toString());
}
}