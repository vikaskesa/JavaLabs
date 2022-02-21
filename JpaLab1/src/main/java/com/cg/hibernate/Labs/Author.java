package com.cg.hibernate.Labs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author_tb")
public class Author {
	@Id
	@Column(name="auth_id")
	private int authorId;
	@Column(name="first_name",length=30)
	private String firstName;
	@Column(name="mid_name",length=30)
	private String middleName;
	@Column(name="last_name",length=30)
	private String lastName;
	@Column(name="phn_no",length=15)
	private String phoneNumber;
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
