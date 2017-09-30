
package com.examen.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="vendor")
public class Vendor implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="vendor_id")
	private Integer idVendor; 

	@Column(name="vendor_code", nullable=false)
	private String codeVendor;
	
	@Column(name="first_last_name", nullable=false)
	private String firstLastName;
	
	@Column(name="vendor_type", nullable=false)
	private String typeVendor;
	
	@Column(name="second_last_name")
	private String secondLastName;
	
	@Column(name="name")
	private String name;
	
	@Column(name="identity_doc")
	private String docIdentity;
	
	@Column(name="address")
	private String address;
	
	@Column(name="representative")
	private String representative;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="acronym")
	private String acronym;
	
	@Column(name="email")
	private String email;
	
	@Column(name="cci_number")
	private String cciNumber;
	
	@Column(name="active", nullable=false)
	private String active;

	public Integer getIdVendor() {
		return idVendor;
	}

	public void setIdVendor(Integer idVendor) {
		this.idVendor = idVendor;
	}

	public String getCodeVendor() {
		return codeVendor;
	}

	public void setCodeVendor(String codeVendor) {
		this.codeVendor = codeVendor;
	}

	public String getFirstLastName() {
		return firstLastName;
	}

	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}

	public String getTypeVendor() {
		return typeVendor;
	}

	public void setTypeVendor(String typeVendor) {
		this.typeVendor = typeVendor;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocIdentity() {
		return docIdentity;
	}

	public void setDocIdentity(String docIdentity) {
		this.docIdentity = docIdentity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRepresentative() {
		return representative;
	}

	public void setRepresentative(String representative) {
		this.representative = representative;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCciNumber() {
		return cciNumber;
	}

	public void setCciNumber(String cciNumber) {
		this.cciNumber = cciNumber;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
	
	

}
