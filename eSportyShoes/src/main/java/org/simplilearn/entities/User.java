package org.simplilearn.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int uid;
	private String username;
	private String password;
	private String email;
	private String first_name;
	private String last_name;
	private String userType;
	
@OneToMany (mappedBy = "user")	
	private List<Customer_order> orders = new ArrayList<>();
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String username, String password, String email, String first_name, String last_name,
			String userType, List<Customer_order> orders) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.userType = userType;
		this.orders = orders;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public List<Customer_order> getOrders() {
		return orders;
	}
	public void setOrders(List<Customer_order> orders) {
		this.orders = orders;
	}
}
