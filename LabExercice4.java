import java.util.Scanner;
class vote{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("what is your age? ");
		int age = sc.nextInt();
		if (age < 18){
			System.out.println("You can vote in " +(18-age)+ " years");
		}
		else{
			System.out.println("You can vote");
		}
	}
}