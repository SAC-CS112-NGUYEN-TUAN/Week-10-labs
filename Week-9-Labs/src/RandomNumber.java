
//package prjarrays;
import java.util.Scanner;


 class RandomNumber{
	 int randomNo;
	 int high;
	 int low;
	Scanner input = new Scanner(System.in);
	public int high(){
			 System.out.println("Enter high random number low-high:");	
		 high = input.nextInt();
		 return high;
	}
	
	public int low(){
		 System.out.println("Enter low random number low-high:");	
	 low = input.nextInt();
	 return high;
}
	
	
	public int GetANumber(){
		
		 randomNo = low + (int) (Math.random()*high);
	 
		 return randomNo;
	 
	 }

}