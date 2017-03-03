import java.util.Date;
import  java.util.*;
interface Likeable{
	int getLikes();
	void like();
}
/**
*@author Ryan Osborne
*This class implements Likeable(no point)
* This class tracks the data for a post like [username, date, likecount]
**/
public class Post implements Comparable{
	protected String username;
	protected Date date = Calendar.getInstance().getTime();
	protected int likeCount=0;
	
	/**
	*increases likeCount by one
	**/
	public void like(){
		this.likeCount++;
	}
	/**
	*@param Post
	*@param Post
	*this method utilizes the PostCompare class and compares the dates of two instances
	*@return int
	**/

  
    
    /**
	*@param String
	*Constructor that sets username
	**/
	public Post(String username){
		this.username = username;
	}
	/**
	*Constructor with no params
	**/
	public Post(){
		this.username = "no username";
	}
	/**
	*@return int
	*returns the likeCount
	**/
	public int getLikes(){
		return(this.likeCount);
	}
	/**
	*@return boolean
	*returns true if 100 or more likes
	*false if less
	**/
	public boolean isPopular(){
		if(this.likeCount>=100){
			return true;
		}
		else{
			return false;
		}
	}
	/**
	*@return String
	*returns a  String with the data of the instance
	**/
	public String toString(){
		return("Post at: "+this.date+". Username: "+this.username+". Number of likes: "+this.getLikes()+". Popular: "+this.isPopular()+" ");
	}
	/**
	*@return Date
	*returns the date of the instance
	**/
	public Date getDate(){
		return this.date;
	}
	public static void main(String[] args){
		Post a = new Post("r");
		a.like();
		System.out.println(a);
	}


}