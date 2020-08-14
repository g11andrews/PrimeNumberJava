import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PrimeNumberGeneratorTest 
{

	
	@Test
	public void isPrimeTest() 
	{
		Generator g = new Generator();
		assertFalse(g.isPrime(g.stop));
		//Creates a new generator with 7 as the end point and 0 as the start point
		Generator g1 = new Generator(7);
		g1.isPrime(g1.stop);
		//Testing is a range end-point is prime.
		assertTrue(g1.isPrime(g1.stop));
		//Testing if '0' is prime
		assertFalse(g1.isPrime(g1.start));
	}
	@Test
	public void rangeTest() 
	{
		
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(7901);
		primes.add(7907);
		primes.add(7919);
		Generator g1 = new Generator(7920,7900);
		g1.generate(g1.start, g1.stop);
		Generator g2 = new Generator(7900,7920);
		g2.generate(g2.start, g2.stop);
		assertArrayEquals(primes, primes);
		assertArrayEquals((g2.generate(g2.start, g2.stop)),primes);
		//Different objects equal each other
		assertArrayEquals((g2.generate(g2.start, g2.stop)), (g2.generate(g2.stop, g2.start)));
		//Opposite ranges match each other (same forward as backward)
		assertArrayEquals((g2.generate(g2.start, g2.stop)), (g1.generate(g1.start, g1.stop)));
	}
	//Creating a test method for array equality
	private void assertArrayEquals(List<Integer> generate, List<Integer> primes) {
		if(generate.size()==primes.size())
		{
			for(int i=0;i<primes.size();i++)
			{
				if(primes.get(i).compareTo(generate.get(i))!=0)
				{
					fail("Range is not equal");
				}
			}
		}
	}

}
