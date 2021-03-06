package codeexercises;

import java.util.stream.IntStream;

/**
 * Linear Search Write a method that returns the index of the first occurrence
 * of given integer in a list. Assume that the index of the first element in the
 * list is zero. If the number does not exist return -1.
 * 
 * @author vishr
 *
 */
public class LinearSearch {

	/**
	 * In java 7 way
	 * 
	 * @param n
	 * @param list
	 * @return
	 */
	public static int search(Integer n, Integer[] list) {
		int result = -1;
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(n)) {
				result = i;
				break;
			}
		}
		return result;

	}

	/**
	 * java 8 way
	 * 
	 * @param n
	 * @param list
	 * @return
	 */
	public static Integer searchStream(Integer n, Integer[] list) {
		Integer result = IntStream.range(0, list.length - 1).filter(i -> list[i] == n).findFirst().orElse(-1);

		return result;

	}

	public static void main(String[] args) {

		System.out.println(search(6, new Integer[] { 3, 1, 3, 2, 6, 9, 7, 6 }));
		System.out.println(searchStream(6, new Integer[] { 3, 1, 3, 2, 6, 9, 7, 6 }));

	}

}
