import javax.swing.JPanel; 
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.*;

class DisplayArea extends JPanel implements ActionListener	{
	final int DISPLAY_SIZE = 500;
	Point p;
	Color currentColor;
	String shape;

	public DisplayArea (){
		setBackground(Color.WHITE);
		setSize(DISPLAY_SIZE ,DISPLAY_SIZE );
		p = new Point(250,250);
		currentColor = Color.RED;
		shape = "circle";
		repaint();
	}
	public Dimension getPreferedSize(){
		Dimension d = new Dimension(DISPLAY_SIZE,DISPLAY_SIZE);
		return d;
	}
	public void actionPerformed (ActionEvent e){

		if (e.getSource() instanceof JComboBox) {//color change

		    JComboBox cb;
	        cb = (JComboBox) e.getSource();
		    String color;

	        color = (String) cb.getSelectedItem();


	        switch(color){
	        	case"red":
	        		currentColor = Color.RED;
	        		break;
	        	case"black":
	        		currentColor = Color.BLACK;
	        		break;
	        	case"blue":
	        		currentColor = Color.BLUE;
	        		break;
	        	case"green":
	        		currentColor = Color.GREEN;
	        		break;
	        	case"yellow":
	        		currentColor = Color.YELLOW;
	        		break;
	        }
	        repaint();
	    }
	    else if(e.getSource() instanceof JRadioButton){
	    	JRadioButton cb;
	        cb = (JRadioButton) e.getSource();
	        
	        if(cb.toString().contains("circle")){
	        	shape = "circle";
	        }
	        else{
	        	shape = "square";
	        }
	        repaint();

	    }
	    else{//non color change
			switch(e.getActionCommand()){
				case "Up":	
					p.move((int)p.getX(),(int)p.getY()-10);//up 10
					repaint();
					break;
				case "Down":
					p.move((int)p.getX(),(int)p.getY()+10);//down 10
					repaint();
					break;
				case "Left":
					p.move((int)p.getX()-10,(int)p.getY());//left 10
					repaint();
					break;
				case "Right":
					p.move((int)p.getX()+10,(int)p.getY());//right 10
					repaint();
					break;
			}
		}
		
		
	}
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(currentColor);
		if (shape.equals("circle")){
			g.drawOval((int)p.getX(), (int)p.getY(), 10, 9);
			g.fillOval((int)p.getX(), (int)p.getY(), 10, 9);
		}
		else {
			g.drawRect((int)p.getX(), (int)p.getY(), 10, 10);
			g.fillRect((int)p.getX(), (int)p.getY(), 10, 10);

		}
		System.out.println("Paint was called");
	}
	
}