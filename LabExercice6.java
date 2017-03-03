import java.util.Scanner;
class LabExercice6{
	public static void main(String[] args){
		Scanner grade = new Scanner(System.in);
		double[] gradeNums = new double[10];
		for (int i = 0 ; i<10; i++){
			gradeNums[i] = grade.nextDouble();
		}
		System.out.println("Average: " + calculateAverages(gradeNums));
		System.out.println("Median: " + median(gradeNums));
		System.out.println("# failed: " + numberFailed(gradeNums));
		System.out.println("# passed: " + numberPassed(gradeNums));
	}
	public static double calculateAverages(double[] gArray){
		double sum = 0;
		for (int i = 0 ; i<10; i++){
			sum+=gArray[i];
		}
		return(sum/10);
	}
	public static double median(double[] gArray){
		//bubble sort because I'm lazy
		for (int i = 0; i<gArray.length;i++){
			for (int j = 0; j<gArray.length-1;j++){
				if (gArray[j] < gArray[j+1]){
					gArray = swap(gArray, j, j+1);
				}
			}
		}
		return(gArray[(int)(gArray.length/2)]);
			
	}
	public static double[] swap(double[] intList, int index1, int index2){
		double indexVal1 = intList[index1];
		intList[index1] = intList[index2];
		intList[index2] = indexVal1;
		return(intList);
	}
	public static int numberFailed(double[] gArray){
		int sum = 0;
		for (int i = 0; i<gArray.length;i++){
			if (gArray[i]<50){
				sum++;
			}
		}
		return(sum);

	}
		public static int numberPassed(double[] gArray){
		int sum = 0;
		for (int i = 0; i<gArray.length;i++){
			if (gArray[i]>50){
				sum++;
			}
		}
		return(sum);1

	}
}