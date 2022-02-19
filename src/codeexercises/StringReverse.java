package codeexercises;

/**
 * Write a method that reverses a string.
For example, 'java interview' becomes 'weivretni avaj'.
 * @author vishr
 *
 */
public class StringReverse {

	/**
	 * using character at witout converting to array
	 * @param data
	 * @return
	 */
	public static String reverseTraditional(String data) {
		StringBuilder sb = new StringBuilder();
		 for(int i=data.length()-1; i>=0; i--) {
			 sb.append(data.charAt(i));
		 }
		return sb.toString();
	}
	
	/**
	 * inbuilt
	 * @param data
	 * @return
	 */
	public static String reverse(String data) {
		StringBuilder sb = new StringBuilder(data);
		return sb.reverse().toString();
	}
	
	
	
	public static void main(String[] args) {

		System.out.println(reverseTraditional("java interview"));
		System.out.println(reverse("java interview"));
	}

}
