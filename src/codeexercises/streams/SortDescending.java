/**
 * 
 */
package codeexercises.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author vishr
 *
 */
public class SortDescending {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
