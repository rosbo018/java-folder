class TextPost extends Post{
	protected String textMessage;
	/**
	*@param String username
	*@param String text message
	*constructor
	**/
	public TextPost(String username, String textMessage){
		this.username = username;
		this.textMessage = textMessage;
	}
	/**
	*@return boolean 
	*returns true if likes>50, false otherwise
	**/
	public boolean isPopular(){
		if(this.likeCount>=50){
			return true;
		}
		else{
			return false;
		}
	}
	/**
	*@return String
	*extends Post.toString
	**/
	public String toString(){
		return(super.toString()+", Message: "+this.textMessage);
	}
	public static void main(String[] args){
		TextPost a = new TextPost("r", "yoyoyoyoyoyoyoyo");
		System.out.println(a);
	}
}