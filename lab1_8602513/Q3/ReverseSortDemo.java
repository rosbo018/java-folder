class ReverseSortDemo{
	public static void main(String[] args){
		char[] cList = new char[]{'a','b','c','d'};
		reverse(cList);

	}
	public static char[] swap(char[] intList, int index1, int index2){
		char indexVal1 = intList[index1];
		intList[index1] = intList[index2];
		intList[index2] = indexVal1;
		return(intList);
	}
	public static void reverse(char[] cList){

		//bubble sort because I'm lazy
		for (int i = 0; i<cList.length;i++){
			for (int j = 0; j<cList.length-1;j++){
				if (cList[j] < cList[j+1]){
					cList = swap(cList, j, j+1);
				}
			}
		}

		for (int i = 0; i<cList.length;i++){
			System.out.println(cList[i]);
		}
	}
}