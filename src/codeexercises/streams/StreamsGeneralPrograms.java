/**
 * 
 */
package codeexercises.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author vishr
 *
 */
public class StreamsGeneralPrograms {

	public static StreamsGeneralPrograms sGprograms = new StreamsGeneralPrograms();
	
	/**
	 * Given a list of integers,
	 *  find the total number of elements present in the list using Stream functions?
	 */
	public long getNumberOfElements(List<Integer> numberOfElements) {
		
		long elements = numberOfElements.stream().count();
		
		return elements;
	}
	
	/**
	 * Given a list of integers, 
	 * find out all the numbers starting with 1 using Stream functions?
	 */
	public void printNumberStartsWith(List<Integer> numberStartsWith){
        numberStartsWith.stream().map(s -> s + "")
		               .filter(s -> s.startsWith("1"))
		               .forEach(System.out::println);
	}
	
	/**
	 *  Given the list of integers,
	 *   find the first element of the list using Stream functions?
	 */
	public void printFirstElement(List<Integer> numberList){
		numberList.stream().findFirst()
		               .ifPresent(System.out::println);
	}
	
	

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Number of elements
        List<Integer> numberOfElements = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(sGprograms.getNumberOfElements(numberOfElements));
        
       //Number starts with
        List<Integer> numberStartsWith = Arrays.asList(10,15,8,49,25,98,32);
        sGprograms.printNumberStartsWith(numberStartsWith);

      //Prints first
        List<Integer> numberList = Arrays.asList(10,15,8,49,25,98,32);
        sGprograms.printFirstElement(numberList);

	}

}
