import java.util.Scanner;
public class IT24100891Lab4Q2{
	public static void main(String[]args){

		System.out.print("Please enter exam marks(out of 100): ");
		Scanner obj = new Scanner(System.in);
		double exammarks = obj.nextDouble();




		if (!(exammarks >= 0 && exammarks <= 100))
		{
			System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}



		System.out.print("Please enter lab submission marks(out of 100): ");
		Scanner obj2= new Scanner(System.in);
		double labmarks = obj2.nextDouble();



		
		if (!(labmarks >= 0 && labmarks <= 100)){
			System.out.println("Invalid input for lab submission marks. Terminating program.");
			return;
		}
		
		


		System.out.print("Please enter the percentage given for the exam: ");
		Scanner obj3= new Scanner(System.in);
		double exampr = obj3.nextDouble();
		
		


		System.out.print("Please enter the percentage given for the lab submission: ");
		Scanner obj4 = new Scanner(System.in);
		double labpr = obj4.nextDouble();


		
		if (exampr + labpr != 100){
			System.out.print("The percentage must add upto 100. Terminating program.");
			return;
		}
		 
		
		double finalmarks = (exammarks*exampr/100)+(labmarks *labpr/100);
		System.out.print("Final Exam Mark is : "+finalmarks);
		
	}
}