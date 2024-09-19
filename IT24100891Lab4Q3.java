import java.util.Scanner;
public class IT24100891Lab4Q3{
	public static void main(String[] args){
		System.out.print("Enter a number: ");
		Scanner obj = new Scanner(System.in);
		double num1 = obj.nextDouble();
		
		String answer = (num1==0)? "zero":
				(num1>0)? "Positive": "Negative";

		
		System.out.print("The number is: "+ answer);
	}
}		