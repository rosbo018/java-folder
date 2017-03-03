public class Timer {
	private int hours;
	private int minutes;
	private int seconds;

	public Timer(){
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
	public void incrementHour(){
		if(this.hours<23){
			this.hours++;
		}
		else{
			this.hours=0;
		}

	}
	public void incrementMin(){
		if(this.minutes<59){
			this.minutes++;
		}
		else{
			this.minutes=0;
		}
		
	}
	public void incrementSec(){
		if(this.seconds<59){
			this.seconds++;
		}
		else{
			this.seconds=0;
		}
	}
		public void decrementHour(){
		if(this.hours>0){
			this.hours--;
		}
		else{
			this.hours=23;
		}

	}
	public void decrementMin(){
		if(this.minutes>0){
			this.minutes--;
		}
		else{
			this.minutes=59;
		}
		
	}
	public void decrementSec(){
		if(this.seconds>0){
			this.seconds--;
		}
		else{
			this.seconds=59;
		}
		
	}
    public int getHour(){
    	return this.hours;
    }
    public int getMin(){
    	return this.minutes;
    }
    public int getSec(){
    	return this.seconds;
    }
	//Your code here
	
	public String toString () {
		return "Timer "+hours+":"+minutes+":"+seconds;
	}
}
  