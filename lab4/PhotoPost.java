public class PhotoPost extends Post{
	protected String fileName, caption;
	/**
	*@param String username
	*@param String filename
	*@param String caption
	*Constructor
	**/
	public PhotoPost(String username, String fileName, String caption){
		this.username = username;
		this.fileName = fileName;
		this.caption = caption;
	}
	/**
	*Constructor with no param
	**/
	public PhotoPost(){
		this.username = "no username";
	}
	/**
	*@return String 
	*returns a string that shows all instance information
	**/
	public String toString(){
		return(super.toString()+" fileName: "+this.fileName+" Caption: "+this.caption+" ");
	}
	public static void main(String[] args){
		PhotoPost a = new PhotoPost("r", "pepe.jpg", "feels bad man");
		a.like();
		System.out.println(a);
	}
}