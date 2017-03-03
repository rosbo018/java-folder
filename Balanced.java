/**
 * ITI 1121. Introduction à l'informatique II (Hiver 2008).
 * ITI 1521. Introduction to Computer Science II (Winter 2008).
 *
 * @author Marcel Turcotte, Université d'Ottawa/University of Ottawa
 */

public class Balanced {
    public static boolean algo1( String s ) {
        boolean valid = true;
        int curly = 0;
        int square = 0;
        int round = 0;

        String[] bracketsCheck = new String[s.length()];
        int bracketIndex = 0;

        for ( int i=0; i<s.length(); i++ ) {

            char c = s.charAt( i );

            switch ( c ) {
            case '{':
                curly++;
                bracketsCheck[bracketIndex] = "curly";
                bracketIndex++;
                break;
            case '}':
                curly--;
                //checks if there is a error in the brackets without accessing the brackets stack
                if (bracketIndex == 0 ){
                    valid = false;
                    break;
                }
                //check if there is the same opening to closing brackets
                //e.g. (xx[xx]x) is ok, but (xx[xx)xx] is not
                if (bracketsCheck[bracketIndex-1] != "curly"){
                    valid = false;
                    break;
                }
                bracketIndex--;
                break;
            case '[':
                square++;
                bracketsCheck[bracketIndex] = "square";
                bracketIndex++;
                break;
            case ']':
                square--;
                if (bracketIndex == 0 ){
                    valid = false;
                    break;
                }
                if (bracketsCheck[bracketIndex-1] != "square"){
                    valid = false;
                    break;
                }
                bracketIndex--;
                break;
            case '(':
                round++;
                bracketsCheck[bracketIndex] = "round";
                bracketIndex++;
                break;
            case ')':
                if (bracketIndex == 0 ){
                    valid = false;
                    break;
                }
                if (bracketsCheck[bracketIndex-1] != "round"){
                    valid = false;
                    break;
                }
                bracketIndex--;
                round--;
            }
            //System.out.println(curly+" "+square+" "+round+" "+bracketsCheck[bracketIndex-1]+" ");
        }
        if(!( curly == 0 && square == 0 && round == 0)){
            valid = false;
        }
        return valid;
    }

    public static void main( String[] args ) {
        for ( int i=0; i<args.length; i++ ) {
            System.out.println( "algo1( \"" + args[ i ] + "\" ) -> " + algo1( args[ i ] ) );
        }
    }
}