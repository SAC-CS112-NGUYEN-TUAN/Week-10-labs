
//package prjarrays;
import java.util.Scanner;


 class RandomNumber{
	 int randomNo;
	 int high;
	Scanner input = new Scanner(System.in);
	public int high(){
			 System.out.println("Enter max random number 0-max:");	
		 high = input.nextInt();
		 return high;
	}
	
	
	public void GetANumber(){
		
		 randomNo = 0 + (int) (Math.random()*10);
	 }
	 public int getNum(){
			return randomNo;
	 
	 }

}