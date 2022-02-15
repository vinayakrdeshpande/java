/**
 * This is to tell wether number is beautiful or not.
 * A number is beautiful if single digit ends up as 1.
 * for ex: 31=(3*3)+(1*1)=9+1=10
 *             (1*1)+(0*0)=1+0=1
 * Hence 31 is beautiful number.  
 * If both numbers are beautiful then return the sum or return the number.
 * else return -1
 * if numbers are same then return only one among them.
 *
 */
package paypal;

/**
 * @author vishr
 *
 */
public class BeautifulNumber {

	/**
	 * Traditional way to achieve the output.
	 * @param start
	 * @param end
	 * @return
	 */
	public int checkAndGetBeautiful(int start, int end) {
		int result = -1;
		boolean startCheck = isBeautiful(start);
		boolean endCheck = isBeautiful(end);
		
		if(startCheck) result=start; 
		if(endCheck && !startCheck)  result = end;
		if(endCheck && startCheck)  result = start + end;

		return result;
	}
	
	
	public boolean isBeautiful(int a) {
        int result = 0;
		result = getSquareSum(a);
	    while(result >9) {
	    	result = getSquareSum(result);
	    }
        if(result==1) return true;
        return false;
	}
	
	public int getSquareSum(int a) {
		
		int sumOfNumber = 0;
		while(a>0) {
			int number=a%10;
			a=a/10;
			sumOfNumber += number*number;
		}
		return sumOfNumber;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 31;
		int b = 32;
		
		BeautifulNumber bNumber = new BeautifulNumber();
		int result = bNumber.checkAndGetBeautiful(a, b);
		System.out.println(result);
	}

}
