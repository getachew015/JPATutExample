package com.dagim.jpa.entity;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@Table(name="customertable") creates the table if not mapped
public class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerid;
	private String customername;
	private String dateofbirth;
	@ElementCollection
	private List<Address> address ;
/*	Set and Map collection map go the same way as the List Mapping above
	Just use @Embaddable annotation at the embedded class
	@ElementCollection
	private Set<Address> address;
	@ElementCollection
	private Map<Address> address;
*/	
	private String contactNumber;
	
	public CustomerDetails(){
		
	}

	public CustomerDetails(String customername, String dateofbirth, List<Address> address,
			String contactNumber) {
		super();
		this.customername = customername;
		this.dateofbirth = dateofbirth;
		this.address = address;
		this.contactNumber = contactNumber;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "CustomerDetails [customerid=" + customerid + ", customername=" + customername + ", dateofbirth="
				+ dateofbirth + ", address=" + address + ", contactNumber=" + contactNumber + "]";
	}
	
	

}
