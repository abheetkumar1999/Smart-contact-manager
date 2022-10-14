package com.smart.scm.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CONTACT")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String name;
	private String secondName;
	private String work;
	private String phone;
	private String email;
	private String image;
	@Column(length = 500)
	private String description;
	
	@ManyToOne
	private User user;
	
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getC_id() {
		return cId;
	}
	public void setC_id(int c_id) {
		this.cId = c_id;
	}
	public String getC_name() {
		return name;
	}
	public void setC_name(String c_name) {
		this.name = c_name;
	}
	public String getC_nickname() {
		return secondName;
	}
	public void setC_nickname(String c_nickname) {
		this.secondName = c_nickname;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
