package sample.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	private long id;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	
	@Autowired(required=true)
	@Qualifier("addr2")
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("\nNAME:"+name+"\nID:"+id);
		System.out.println("\nADDRESS:"+address.getAddress());
	}
	
	

}
