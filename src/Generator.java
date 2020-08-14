import java.util.ArrayList;
import java.util.List;

public class Generator implements PrimeNumberGenerator
{
	//implementing the interface 
	//data members
	int start=0,stop=0;
	//constructors
	public Generator() {}
	//This constructor assumes 0 is start, and the single input is the end of range
	public Generator(int second) 
	{
		setStop(second);
	}
	public Generator(int first, int second) 
	{
		setStart(first);
		setStop(second);
	}
	//getters and setters
	public int getStart() 
	{
		return start;
	}

	public void setStart(int start) 
	{
		this.start = start;
	}

	public int getStop() 
	{
		return stop;
	}

	public void setStop(int stop) 
	{
		this.stop = stop;
	}
	//overriding required methods
	@Override
	public List<Integer> generate(int startingValue, int endingValue) 
	{
		if (endingValue<startingValue)
	    {
	    	//I use a temp variable to switch the values of the numbers to show appropriate range
	    	
	    	//The reason I set them to zero then add another variable to them is because of..
	    	//how in other programming languages, setting a variable equal to another variable..
	    	//assigns the variable to the same memory location (pass by value vs. pass by reference).
	    	int temp=0;
	    	temp+=startingValue;
	    	startingValue=0;
	    	startingValue+=endingValue;
	    	endingValue=0;
	    	endingValue+=temp;
	    }
		List<Integer> primes = new ArrayList<Integer>();
		for (Integer i = startingValue; i <= endingValue; i++)         
	       { 		  	  
	         if(isPrime(i))
	         {
	        	 primes.add(i);
	         }
	       }	
		//Returns a list of all primes between two inputs
		return primes;
	}

	@Override
	public boolean isPrime(int value) 
	{
		 int counter=0; 	  
         for(int num =value; num>=1; num--)
		  {
	         if(value%num==0)
		     {
	        	 counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     return true;
		  }	
		//Returns whether a number is prime
		return false;
	}
	
	//the final return method to display primes
	void printPrimes() 
	{
		System.out.println("Primes from "+start+" to "+stop+": "+generate(start,stop).toString());
	}
	
}
