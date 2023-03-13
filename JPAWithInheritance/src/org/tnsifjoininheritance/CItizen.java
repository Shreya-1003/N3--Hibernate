package org.tnsifjoininheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Citizen")
public class CItizen extends Student1{

	private String citizenType;
	private Integer passsportno;
	
	//getter stter
	public String getCitizenType() {
		return citizenType;
	}
	public void setCitizenType(String citizenType) {
		this.citizenType = citizenType;
	}
	public Integer getPasssportno() {
		return passsportno;
	}
	public void setPasssportno(Integer passsportno) {
		this.passsportno = passsportno;
	}
	
}
