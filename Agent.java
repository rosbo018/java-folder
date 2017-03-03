class Agent{
	Combination combo;
	DoorLock door;
	public Agent(){
		this.combo = new Combination(1,2,3);
		this.door = new DoorLock(this.combo);
	}
	public DoorLock getDoorLock(){
		return(this.door);
	}
	public void activateDoorLock(){
		this.door.activate(this.combo);
	}
	public static void main(String[] args){
		Agent na = new Agent();
		System.out.println(na.getDoorLock());
	}
}