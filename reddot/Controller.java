import java.awt.event.*;

public class Controller implements ActionListener {
	
	private GUI model;
	
	private View[] views;
	private int numberOfViews;
	
	public Controller(){
	
		views = new View[2];
		numberOfViews = 0;
		model = new GUI() ;
		register(new GraphicalView(model, this));

		update();
	}
	private void register(View view) {
		views[numberOfViews] = view;
		numberOfViews++;
	}
	private void update() {
		for (int i = 0; i < numberOfViews; i++) {
			views[i].update();
		}
	}
	
	public void actionPerformed ( ActionEvent e ) {
		switch (e.getActionCommand()){
			case "hour++": model.incrementHour();
				break;
			case "Min++":model.incrementMin();
				break;
			case "Sec++":model.incrementSec();
				break;
			case "hour--":model.decrementHour();
				break;
			case "Min--":model.decrementMin();
				break;
			case "Sec--":model.decrementSec();
				break;
		}
	
	//your code here
		
	update();
	}
}
  