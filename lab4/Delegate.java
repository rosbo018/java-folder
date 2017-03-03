public class Delegate implements Comparable<Post>{
	public int compare(Post c1, Post c2)
    {
        return c1.getDate().compareTo(c2.getDate());
    }
	
}