import java.util.Scanner;

public class WhileLoop
{
	public static void main(String[] args) {
	    
	    Scanner S = new Scanner(System.in);
	    
		System.out.print("Enter any number: ");
		int N = S.nextInt();
		System.out.println("Multiplication of "+ N + " is :");
	    
	    
	    int M;
	    int i = 1;
	    while (i <=10){
	        M = N * i;
	    
		System.out.println( N + " * " + i + " = " + M);
		i++;
	        
	    }
	    
		
	}
}
