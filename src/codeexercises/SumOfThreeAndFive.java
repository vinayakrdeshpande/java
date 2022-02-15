package codeexercises;
import java.util.stream.IntStream;


/**
 * if n = 15
 * 
 *  3+5+9+10+12+15=
 * @author vishr
 *
 */

public class SumOfThreeAndFive {

	/**
	 * java 7 way
	 * @param n
	 * @return
	 */
	public static int oldsumOf3And5(int n) {
	    int sum=0; 
		for(int i=3;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum +=i;
			}
		}
		return sum;
	}
	
	/**
	 * java 8 way
	 * @param n
	 * @return
	 */
	public static int sumOf3And5(int n) {
		Integer sum = 0;
		
		sum = IntStream.rangeClosed(3, n)
				.filter(i-> (i%3==0 || i%5==0))
				.sum();
				
		return sum;
	}
	
	public static void main(String[] args) {

		int n = 15;
		System.out.println(oldsumOf3And5(n));
		System.out.println(sumOf3And5(n));
	}

}
