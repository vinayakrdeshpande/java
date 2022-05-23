package other;

import java.util.List;

public class Person {
	String name;
	List<Address> addresses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Person(String name2, List<Address> addresses2) {
		this.name = name;
		this.addresses = addresses;
	}
	
	
}
