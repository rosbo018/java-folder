class DoorLock{
	static final int Max_Number_Of_attempts = 3;
	Combination combination;
	boolean open = false;
	boolean activated = true;
	int numAttempts = 0;
	public DoorLock(Combination comb){
		this.combination = comb;
	}
	public boolean isOpen(){
		return (open);
	}
	public boolean isActive(){
		return (activated);
	}
	public void activate(Combination other){
		if (this.combination.equals(other)){
			this.activated = true;
		}
	}
	public String toString(){
		return("open: "+this.open+", activated: "+this.activated+", number of attempts taken: "+this.numAttempts);
	}
	public void open(Combination c){
		if(this.activated){
			if (c.equals(this.combination)){
				this.open = true;
				this.numAttempts = 0;
			}
			else{
				this.numAttempts++;
				if (this.numAttempts == Max_Number_Of_attempts){
					this.activated = false;
				}
			}
		}
	}
	public static void main(String[] args){
		Combination c1 = new Combination(1,2,3);
		DoorLock door = new DoorLock(c1);
		Combination c2 = new Combination(1,2,3);
		System.out.println(door);
		door.open(c2);
		System.out.println(door);
		
	}
}
