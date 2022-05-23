package other;

import java.util.List;

public class Employee {
	String type;
	List<Person> persons;
	
	public Employee(String type, List<Person> persons) {
		super();
		this.type = type;
		this.persons = persons;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

}
