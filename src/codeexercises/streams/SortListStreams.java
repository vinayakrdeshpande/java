/**
 * Given a list of integers,
 * sort all the values present in it using Stream functions?
 */
package codeexercises.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author vishr
 *
 */
public class SortListStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().sorted().forEach(System.out::println);  
        
	}

}
