class createArray{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0])+1;
		int[] array = new int[n];
		for ( int i = 0; i < n; i++){
			array[i] = i*i;
			System.out.println("The square of "+i+" is "+array[i]+".");
		}
	}
}