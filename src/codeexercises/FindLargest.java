package codeexercises;

/**
 * Write a method that returns the largest integer in the list.
You can assume that the list has at least one element.
 * @author vishr
 *
 */
public class FindLargest {

	
	public static int findMaxByDivideandRule(int[] data){
		int first = data.length/2;
		int second = data.length-first;
		int max= data[0];
		for(int i=0;i<first;i++) {
			
			if(data[i+first]>max)
				max=data[i+first];
			else max=data[i];
				
		}
		
		return max;
	}
	public static void main(String[] args) {
     int[] data= {1,4,7,29,8,9};
     System.out.println(findMaxByDivideandRule(data));
     
	}

}
