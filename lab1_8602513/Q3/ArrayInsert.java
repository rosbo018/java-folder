class ArrayInsert{
	public static void main(String[] args){
		int[] sArray = new int[5];
		for (int i= 0; i<5;i++){
			sArray[i] = i+1;
		}
		int location = Integer.parseInt(args[0]);
		int value = Integer.parseInt(args[1]);
		int[] cArray = insert(sArray, location, value);
		for (int i = 0; i<cArray.length; i++){
			System.out.println(cArray[i]);
		}

	}
	public static int[] insert(int[] initArray, int location, int value){
		int[] arr = new int[initArray.length+1];
		for (int i = 0; i < location; i++){
			arr[i] = initArray[i];
			
		}
		arr[location] = value;
		for (int i = location+1; i < arr.length; i++){
			arr[i] = initArray[i-1];
		}
		return(arr);
	}
}