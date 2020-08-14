import java.util.Scanner;

public class Starter {

	public static void main(String[] args) 
	{
		int num1=0, num2=0;
		Scanner scan = new Scanner(System.in);
		boolean filled=false;	    
	    while(!filled)
	    {
	    	System.out.println("Enter your first number: ");
	    	if(scan.hasNextInt())
	    	{
	    		num1 = scan.nextInt();
	    		filled=true;
	    	}
	    	else
	    	{
	    		scan.next();
	    	}
	    }
	    filled=false;	    
	    while(!filled)
	    {
	    	System.out.println("Enter your second number: ");
	    	if(scan.hasNextInt())
	    	{
	    		num2 = scan.nextInt();
	    		filled=true;
	    	}
	    	else
	    	{
	    		scan.next();
	    	}
	    }
	    System.out.println("Your first number is: "+num1);
	    System.out.println("Your second number is: "+num2);
	    
		scan.close();
		Generator g= new Generator(num1,num2);
		g.printPrimes();
	}
		
		
		
}
	
