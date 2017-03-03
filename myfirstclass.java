public class myfirstclass {
	String message;
	public myfirstclass (String h){
		message = h;
	}
	public static void main(String[] args){
		myfirstclass cl = new myfirstclass("java is the worst");
		System.out.println(cl.message);
		
	}
}