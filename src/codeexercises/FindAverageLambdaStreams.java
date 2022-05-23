package codeexercises;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverageLambdaStreams {

	public static double getAverage(List<Integer> lst) {
		
		OptionalDouble average = 	lst.stream().mapToInt(number -> number.intValue()).average();
		
		return average.getAsDouble();
	}
	
	public static void main(String[] args) {
        List <Integer> listOfIntegers = Arrays.asList(20, 50, 99, 12, 94);

		System.out.println(getAverage(listOfIntegers));
	}

}
