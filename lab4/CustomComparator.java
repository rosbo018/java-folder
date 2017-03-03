public class CustomComparator implements Comparator<Post> {
    @Override
    public <O>int compare(<O> o1, <O> o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}