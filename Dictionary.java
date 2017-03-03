public class Dictionary {
//implements Map<String, Integer>
	Pair[] arr;
	int top = 0;
	public final int INITIAL_SIZE = 10;
	public Dictionary(){
		arr = new Pair[INITIAL_SIZE];
	}

	//@Override
	public int  get(String key){
		for (Pair x: arr){
			if (key.equals(x.getKey())){
				return(x.getValue());
			}
		}
		return 0;
	}
	//gets value defined by the key
	//@Override
	public boolean contains(String key){
		for (int i = 0; i<top;i++){
			if (key.equals(arr[i].getKey())){
				return(true);
			}
		}
		return(false);
	}
	//returns if key exists
	//@Override
	public void put(String key, int value){
		Pair temp = new Pair(key, value);
		dynamicSize(true);
		arr[top] = temp;
		top++;
		
	}
	//adds the key:value to the map
	//@Override
	public void replace(String key, int value){
		for (Pair x: arr){
			if (key.equals(x.getKey())){
				x.setValue(value);
			}
		}
	}
	//replaces the values defined by K key with value
	//@Overrid
	public int remove(String key){
		for (int i = arr.length-1; i>0;i--){
			if (arr[i].getKey().equals( key)){
				int temp = arr[i].getValue();
				arr[i] = null;
				top--;
				return temp;
			}
		}
		return 0;
	}
	// removes the first occurance of the key, and returns the value
	void dynamicSize(boolean up){
		Pair[] temp;
		//System.out.println(top);
		if ((top%5) == 0){
			temp = new Pair[arr.length+5];
			for (int i = 0; i <arr.length; i++){
				temp[i]=arr[i];
			}
			arr = temp;
		}
		else if(!up && (top+1)%5 == 0 && top < arr.length-1){
			temp = new Pair[arr.length-5];
			for (int i = 0; i <arr.length; i++){
				temp[i]=arr[i];
			}
			arr = temp;
		}
	}
	public String toString(){
		String temp = "";
		for (int i = 0; i<top; i++){
			temp+=arr[i].getKey()+": "+arr[i].getValue()+"\n";
		}
		return temp;
	}
	public static void main(String[] args){
		Dictionary newDic = new Dictionary();
		for (int i = 0; i < 100; i++){
			newDic.put("help_"+i, i*i);
		}
		System.out.println(newDic.get("help_5"));
		//System.out.println(newDic);
	}
}