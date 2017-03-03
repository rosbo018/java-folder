import java.util.*;
import java.util.Arrays;

class NewsFeed{
	
	public List<Object> postArray =  new ArrayList<Object>();
	/**
	*@param Generic post
	*adds any object ti the List
	**/
	public < O > void addPost(O post){
		this.postArray.add(post);
	}
	/**
	*Sorts the post by the oldest
	**/
	public void sortPostsByOldest(){
		Object o = new Object();
		for (int i = 0; i<this.postArray.size(); i++){
			for (int j = 0; j<this.postArray.size(); j++){
				if(this.postArray(j).getDate().compareTo(this.postArray(i).getDate()) > 0){
					o = this.postArray(i);
					this.postArray(i) = this.postArray(j);
					this.postArray(j) = o;
				}
			}
		}
		//Collections.sort(this.postArray);

	}
	/**
	*@return int size
	*returns the size of the list
	**/
	public int size(){
		return(postArray.size());
	}
	/**
	*@return NewsFeed
	*returns only photoPosts in the arrayList
	**/
	public NewsFeed getPhotoPost(){
		NewsFeed tempArr = new NewsFeed();
		
		for (Object e:this.postArray){
			if (e instanceof PhotoPost){
				tempArr.addPost(e);
			}
		}
		return (tempArr);
	}
	/**
	*@param NewsFeed other
	*@return NewsFeed
	*returns a NewsFeed that is the combination of the current instance and an other instance of Newsfeed
	**/
	public NewsFeed plus(NewsFeed other){
		NewsFeed tempObj = new NewsFeed();
		for (Object e:this.postArray){
			tempObj.addPost(e);
		}
		for (Object e:other.postArray){
			tempObj.addPost(e);
		}
		return(tempObj);
	}
	/**
	*prints the Posts in Newsfeed
	**/
	public void printFeed(){
		for (Object e : this.postArray){
			System.out.println(e);
		}
	}
	public static void main(String[] args){
		PhotoPost a = new PhotoPost("r", "pepe.jpg", "feels bad man");
		a.like();
		TextPost b = new TextPost("r", "yoyoyoyoyoyoyoyo");
		Post c = new Post("r");
		NewsFeed feed = new NewsFeed();
		feed.addPost(a);
		feed.addPost(b);
		feed.addPost(c);
		feed.printFeed();
	}

	
}