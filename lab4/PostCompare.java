public class PostCompare implements Comparable<Post>{
	public int compare(Object c1, Object c2)	
    {
        return c1.getDate().compareTo(c2.getDate());
    }
	
}