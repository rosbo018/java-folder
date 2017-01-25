import java.util.List;
import java.lang.Math;
class truth{
	public static boolean[][] createTruthTable(int numVars){
		//creates a new truth table using number of variables
		boolean[][] tempBool = new boolean[numVars][(int) Math.pow(2,numVars)];
		//array with variables (if there are n variables, there are 2^n rows)
		int counter = 0;//counter to seperate the truth vs false
		for (int i =0; i < numVars; i++){
			boolean x = false;//used to assign value to the truth template
			for (int j =0; j < Math.pow(2,numVars); j++){
				if (counter % Math.pow(2,(i)) ==0){// creates the format
					/*
					ex for 2 vars
					true True
					true false
					false true
					false false
					*/
					x= !x;
				}
				tempBool[i][j] = x;
				counter++;
				
			}
			counter = 0;	
			
		}
		return(tempBool);
	}
	public static boolean[][] applyOperator(boolean[][] arr, String op, int var1, int var2){
		//in development, uses operators to run through truth table and get output
		
		for (int i =0; i < arr.length; i++){
			for (int j =0; j < arr[i].length; j++){
				newarr[i][j] = arr[i][j];//creates a new 2d array with additional column
			}
		}
		if (op.equals("and")){//will be changed

			for (int j =0; j < newarr[0].length; j++){
				newarr[arr.length][j] = newarr[var1][j] & newarr[var2][j];
			
			}
		}
		return (newarr);

	}
	public static void printTruthTable(boolean[][] arr, String[] vars){
		for (int i =0; i < arr.length; i++){
			System.out.print(vars[i]+ " ");
			for (int j =0; j < arr[i].length; j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
	public static String[] addNewVar(String[] vars, String add){
		String[] newvars = new String[vars.length+1];
		for (int i =0;i<vars.length;i++){
			newvars[i]=vars[i];
		}
		newvars[vars.length]= add;
		return (newvars);

	}
	public static List<String> equationParseFix(String[] varAndOp){
		List<String> operatorList = new ArrayList<String>();
		List<String> varList = new ArrayList<String>();
		for (int i = 0; i<varAndOp.length;i++){
			if (varAndOp[i].matches("[!&||]")){
				operatorList.add(varAndOp[i]);
			}
			else{
				varList.add(varAndOp[i]);
			}
		}
		List<String> combinedList = new ArrayList<String>(varList);
		combinedList.addAll(operatorList);
		
		return(combinedList);

	}
	public static boolean[][] applyOp(List<String> initStack, boolean[][] truthtable, int numVars){
		boolean[][] newarr = new boolean[truthtable.length+1][truthtable[0].length];

	}
	public static int determineNumVars(String[] varAndOp){
		// determines number of variables that were inputed
		int counter = 0;
		for (int i = 0; i<varAndOp.length;i++){
			if (!varAndOp[i].matches("[!&||]")){
				varAndOp.remove(i);
			}
		}
		Set<String> varSet = new HashSet<String>(varAndOp);//creates a set of all variables since variables could be used twice
		return(varSet.length);
	}
	public static boolean evaluateExpression(boolean val1, boolean val2, String expression){
		if (expression == "&"){
			return((val1 && val2))
		}
		if (expression == "!"){
			return((!val1))
		}
		if (expression == "|"){
			return((val1 or val2))
		}
	}
	public static void main(String[] args){
		//String[] vars = addNewVar(args, "P");

		//adds new variable( will be replaced)
		int numVars = determineNumVars(args);
		boolean[][] arr = createTruthTable(numVars);
		//creates a truthtable with two variables
		boolean[][] newarr = applyOp(equationParseFix(args), arr, numVars);
		//adds a new row to the truth table based on operations
		printTruthTable(newarr, vars);
		//Prints the truth table
	}
}