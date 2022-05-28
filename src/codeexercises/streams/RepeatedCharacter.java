/**
 * Q7 Given a String, 
 * find the first repeated character in it using Stream functions?
 */
package codeexercises.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author vishr
 *
 */
public class RepeatedCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        String input = "Java Hungry Blog Alive is Awesome";

      /**  
      Set<Entry<Character,Long>>  data= input.chars() // Stream of String       
        .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
        .entrySet(); //Store the chars in map with count 
      **/
        
        Character result = input.chars() // Stream of String       
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        
        System.out.println(result);
		
	}

}
