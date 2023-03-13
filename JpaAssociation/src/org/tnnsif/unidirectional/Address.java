package org.tnnsif.unidirectional;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address implements Serializable{

	private Integer pincode;
	private String city;
	private String area;
	private String state;
	
	//getter setter
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", area=" + area + ", state=" + state + "]";
	}
	//default
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//para
	public Address(Integer pincode, String city, String area, String state) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.area = area;
		this.state = state;
	}
	
	
	
}
