package other;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Address {
	String street;
	URI uri;
	
	public Address() {
		
	}
	
	public Address(String street, String uri) {
		super();
		this.street = street;
		try {
			this.uri = new URI(uri);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public URI getUri() {
		return uri;
	}
	public void setUri(String uri) {
		try {
			this.uri = new URI(uri);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
}
