class AverageDemo{
	public static void main(String[] args){
		double[] values = new double[args.length];
		for (int i = 0; i<args.length; i++){
			values[i]= Double.parseDouble(args[i]);
		}
		System.out.println("The average is "+average(values));
	}
	public static double average(double[] arr){
		double aver = 0;
		for (int i =0; i<arr.length; i++){
			aver+=arr[i];
		}
		return (aver/arr.length);
	}
}