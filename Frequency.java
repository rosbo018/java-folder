
import java.lang.Math;
class Frequency{
	public static void main(String[] args){
		//double hangmass = Double.parseDouble(args[0]);
		double length = 0.981;
		//int node = Integer.parseInt(args[1]);
		double mLen = 0.00126;
		//double tension = (double)(hangmass*9.8);
		for (double i = 0.1494; i<0.4494; i+=0.1){
			System.out.println("Mass: "+i+": ");
			for (int j = 2; j<6;j++){

				System.out.println("Node: "+j+": "+Math.sqrt((i*9.8)/mLen)/(2*(length/j)));
			}
		}
	}
}