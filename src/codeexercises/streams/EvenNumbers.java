/**
 * https://javahungry.blogspot.com/2020/05/java-8-coding-and-programming-interview-questions.html
 * Given a list of integers, 
 * find out all the even numbers exist in the list using Stream functions?
 */
package codeexercises.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vishr
 *
 */
public class EvenNumbers {

	private static EvenNumbers evenNumb = new EvenNumbers();

	public void printEvenNumbersList(List<Integer> listOfInt) {

		listOfInt.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

	
	public List<Integer> getEvenNumbersList(List<Integer> listOfInt) {

		return listOfInt.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		System.out.println(evenNumb.getEvenNumbersList(myList).toString());
		System.out.println("");
		evenNumb.printEvenNumbersList(myList);
	}

}
