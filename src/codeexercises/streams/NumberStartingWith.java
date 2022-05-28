/**
 * Given a list of integers, 
 * find out all the numbers starting with 1 using Stream functions?
 */
package codeexercises.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author vishr
 *
 */
public class NumberStartingWith {

	private static NumberStartingWith numberstart = new NumberStartingWith();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		myList.stream().map(s -> s + "")
		               .filter(s -> s.startsWith("1"))
		               .forEach(System.out::println);
		
	}

}
