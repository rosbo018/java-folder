java.util.Date;
interface Likeable{
	int getLikes();
	like();
}
class post implements Likeable, Comparable{
	protected String username;
	protected Date date = Calendar.getInstance().getTime();
	protected int likeCount=0;
	public void like(){
		this.likeCount++;
	}
	public int getLikes(){
		return(this.likeCount);
	}
	public boolean isPopular(){
		if(this.likeCount>=100){
			return true;
		}
		else{
			return false;
		}
	}
	public String toString(){
		return("Post at: "+this.date+". Username: "+this.username+". Number of likes: "+this.likeCount+". Popular: "+this.isPopular());
	}



}