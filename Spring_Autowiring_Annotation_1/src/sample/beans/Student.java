package sample.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private String name;
	private String id;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	@Required
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("\nNAME:"+name+"\nID:"+id);
		System.out.println("\nCITY:"+address.getCity()+"\nPIN:"+address.getPin()+"\nSTATE:"+address.getState());
	}
}
