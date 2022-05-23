package codeexercises;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertUppercase {

	
	public List<String> toUpperCase(List<String> lst) {
		
		return lst.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
