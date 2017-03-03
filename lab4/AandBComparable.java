abstract class AandBComparable implements Comparable {

  public int compare(Object c1, Object c2){
    return c1.getDate().compareTo(c2.getDate());
  }
}