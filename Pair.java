public class Pair{

		private String key;
		private int value;
		public Pair(String key, int value){
			this.key = key;
			this.value = value;
		} 
		String getKey(){
			return this.key;
		}
		int getValue(){
			return this.value;
		}
		void setValue(int val){
			this.value = val;
		}
	}