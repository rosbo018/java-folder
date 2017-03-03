import java.util.Arrays;
class Combination{
	private int[] value = new int[3];
	public Combination(int a, int b, int c){
		//yup
		value[0] = a;
		value[1] = b;
		value[2] = c;
	}

	public boolean equals(Combination other){
		//eh
		return ((this.value[0] == other.value[0]) && (this.value[1] == other.value[1]) && (this.value[2] == other.value[2]));
	}
	public String toString(){
		return (value[0]+":"+value[1]+":"+value[2]);
	}
	public static void main (String [] args){
		Combination a = new Combination(1,2,3);
		Combination b = new Combination(1,2,3);
		System.out.println(a);

	}
}