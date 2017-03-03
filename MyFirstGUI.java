import javax.swing.*;
import java.awt.*;

 public class MyFirstGUI{

  public static void main(String[] args){
	 
	JFrame myFrame = new JFrame();
	//set the title
	myFrame.setTitle("My first Window");
	
	//set the size to 500X300 pixels (width by heigth)
	myFrame.setSize(500, 300);
	
	//set the object to the middle of our screen
	myFrame.setLocationRelativeTo(null);
	
	//end program when user closes the window
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	//create a panel
	JPanel myPanel = new JPanel();
	//add a label to the panel
	myPanel.add(new Label("My first panel"));
	//set panel background color
	myPanel.setBackground(Color.green);
	//add the panel to the frame
	myFrame.add(myPanel, BorderLayout.NORTH);

	JPanel panelEast = new JPanel();
	panelEast.setBackground(Color.orange);
	JButton yesButton = new JButton("start");
	panelEast.add(yesButton, BorderLayout.WEST);

	JButton noButton = new JButton("end");
	panelEast.add(noButton, BorderLayout.EAST);

	JPanel panelSouth = new JPanel();
	panelSouth.setBackground(Color.yellow);
	panelSouth.add(new Label("My third panel"));
	myFrame.add(panelSouth, BorderLayout.SOUTH);
	myFrame.add(panelEast, BorderLayout.EAST);


	//YOUR CODE HERE
	
	
	//set the window to visible      
    myFrame.setVisible(true);
	}

}