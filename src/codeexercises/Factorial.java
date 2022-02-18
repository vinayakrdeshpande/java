package codeexercises;

import java.util.stream.IntStream;

public class Factorial {

	
	/**
	 * Java 7 style of caluclating factorial
	 * @param n
	 * @return
	 */
	public static int getFactorialJavaOld(int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result *=i;
		}
		return result;
	}
	
	/**
	 * Java 7 style of caluclating factorial
	 * @param n
	 * @return
	 */
	public static int getFactorialJavarecursive(int n) {
	
		int result = n;
		if(n!=1) {
			result *=getFactorialJavarecursive(n-1);
		}
		return result;
	}
	
	
	/**
	 * java 8
	 * @param n
	 * @return
	 */
    public static int getFactorialJavaStreams(int n) {
    	
    	int result = IntStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y);
    	
    	return result;
		
	}
	
	public static void main(String[] args) {

		System.out.println(getFactorialJavaOld(5));
		System.out.println(getFactorialJavarecursive(5));
		System.out.println(getFactorialJavaStreams(5));
	}

}
