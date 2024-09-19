import java.util.Scanner;
public class IT24100891Lab4Q1{
	public static void main(String[]args){
		String answer;
		System.out.print("Enter a number: ");
		Scanner obj = new Scanner(System.in);
		double num = obj.nextDouble();
		if(num == 0){
			 answer = "Zero";
		}
		else if (num>0){
			answer = "Positive";
		}
		else{
			answer = "Negative";
		}
			
		System.out.print("The number is: " + answer);		
				
			
		
	}		
}				
		