import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args) {
	    
	    Scanner S = new Scanner(System.in);
	    
		System.out.print("Enter any number: ");
		int num = S.nextInt();
	
		int  rem, sum=0, number;
        number = num;
        while (number != 0){
            rem = number % 10;
            sum = sum + rem * rem * rem;
            number = number / 10;
            
        }
        if (sum == num)
             System.out.println("Armstrong Number");
        else
            System.out.println("Not, an armstrong Number");
	        
	    
	    
		
	}
}
