package other;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Employee
 String type
 List<person> p;

Person
 name
 List<address>
 
Address
  String Street
  URI uri
  
  List of employees contract and permanent 
  
  input: list of employees
  output: Contract-List of uris
          permanent-list uris   Map<String,List<URI>> 
  
 * @author vishr
 *
 */
public class EmployeeTypeUriList {
	
	private final static String CONTRACTOR = "CONTRACTOR";
	private final static String PERMANENT = "PERMANENT";
    public Employee getSamplePermanentData1() {
        List<Address> addresses = new ArrayList<>();
  		  addresses.add(new Address("AP2", "urn:isbn:APPermanentsecond2"));
  		  addresses.add(new Address("MP2", "urn:isbn:MPPermanentsecond2"));
  		  Person person = new Person("Amar2",addresses);
  		  
  		 List<Address> addresses1 = new ArrayList<>();
 		  addresses1.add(new Address("AP21", "urn:isbn:APPermanentsecond21"));
 		  addresses1.add(new Address("MP21", "urn:isbn:MPPermanentsecond21"));
 		  Person person1 = new Person("Akash2",addresses);
 		  
  		  List<Person> persons = new ArrayList<>();
  		  persons.add(person1);
  		  persons.add(person);
  		  Employee emp = new Employee(PERMANENT,persons);
  		
  		  return emp;
      }
    
	
    public Employee getSamplePermanentData() {
        List<Address> addresses = new ArrayList<>();
		  addresses.add(new Address("AP", "urn:isbn:APPermanentsecond"));
		  addresses.add(new Address("MP", "urn:isbn:MPPermanentsecond"));
		  Person person = new Person("Amar",addresses);
		  
		 List<Address> addresses1 = new ArrayList<>();
		  addresses1.add(new Address("AP1", "urn:isbn:APPermanentsecond1"));
		  addresses1.add(new Address("MP1", "urn:isbn:MPPermanentsecond1"));
		  Person person1 = new Person("Akash",addresses);
		  
  		  List<Person> persons = new ArrayList<>();
  		  persons.add(person1);
  		  persons.add(person);
  		  Employee emp = new Employee(PERMANENT,persons);
  		
  		  return emp;
      }
	      
      public Employee getSampleContractorData() {
        List<Address> addresses = new ArrayList<>();
  		  addresses.add(new Address("Rampur", "urn:isbn:RAmpurContract1"));
  		  addresses.add(new Address("Tejpur", "urn:isbn:TejpurContract1"));
  		  Person person = new Person("emp",addresses);
  		  
  		 List<Address> addresses1 = new ArrayList<>();
 		  addresses1.add(new Address("Rampur1", "urn:isbn:RampurContract11"));
 		  addresses1.add(new Address("Tejpur1", "urn:isbn:TejpurContract11"));
 		  Person person1 = new Person("emp1",addresses);
 		  
  		  List<Person> persons = new ArrayList<>();
  		  persons.add(person1);
  		  persons.add(person);
  		  Employee emp = new Employee(CONTRACTOR,persons);
  		
  		  return emp;
      }
      
      public List<Employee> getAllSample(){
    	  
    	  List<Employee> emplst = new ArrayList<>();
    	  emplst.add(getSampleContractorData());
    	  emplst.add(getSamplePermanentData());
    	  emplst.add(getSamplePermanentData1());
    	  
    	  return emplst;
      }
      
      
	public static void main(String[] args) {
		
		List<Employee> input = new EmployeeTypeUriList().getAllSample();
		
		Map<String, List<URI>>	empWithURI = new HashMap<>();
		
		Map<String, List<Person>> emplst = input.stream()
	      .collect(Collectors.toMap(Employee::getType, Employee::getPersons));
		

		 input.stream()
	      .collect(Collectors.groupingBy(Employee::getType));
		
		
		
		System.out.println(emplst);
	}

}
