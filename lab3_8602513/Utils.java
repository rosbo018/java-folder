import java.util.*;
public class Utils {

    /**
     * Returns a copy of the array 'in' where each word occurring in the array
     * 'what' has been replaced by the word occurring in the same position
     * in the array 'with'.
     *
     * @param in an array of Strings;
     * @param what an array of words to be replaced;
     * @param with an array of replacement words;
     * @return a new array idententical to 'in' except that all the occurrences of words
     * found in 'what' have been replaced by the corresponding word from 'with'.
     */

    public static String[] findAndReplace( String[] in, String[] what, String[] with ) {
        //could have just used a dictionary (associative array)

        String[] out = null; // The new array to be returned
	boolean valid = true; // True if the pre-conditions are satistified

	// Testing pre-conditions
    //for (int i = 0; i< in.length; i++){
    
    //}

	if ( in == null || what == null || with == null || what.length != with.length) {
	    valid = false;

	} 
    else if(Arrays.asList(in).contains(null) || Arrays.asList(what).contains(null) || Arrays.asList(with).contains(null)){
        //no npe no longer
        // used to make sure a list does not contain null
        //there's no reason to use arrays over arrayLists in this situation
        valid = false;
    }
    else {

        for (int i = 0; i< in.length;i++){//goes through (in) array
            for (int j = 0; j<what.length;j++){//for every element in (in), goes through what
                if (in[i].equals(what[j])){//if element exists in what
                    in[i] = with[j];//set the (in) element to be equal to the with at the same index
                }
            }
        }
	    //more or less 16 lines missing
	}

	if ( valid ) {
	    out = new String[ in.length ];
	    for ( int i=0; i < in.length; i++ ) {// sets out to be equal to in
            out[i] = in[i];
		//more or less 10 lines missing
	    }
	}

        // Returning a reference to the newly created array that
        // contains the same entries as 'in' except that all the
        // occurrences of words from 'what' have been replaced by
        // their corresponding occurrence from 'with'.

        return out;
    }
    public static void main(String[] args){
        String[] in = new String[]{"this", "is", "a", "test"};
        String[] what = new String[]{"is", "test"};
        String[] with = new String[]{"x", "y"};
        String[] out = new String[in.length];
        out = findAndReplace(in, what, with);
        for ( int i=0; i < in.length; i++ ) {
            System.out.println(out[i]);
        }
    }

}