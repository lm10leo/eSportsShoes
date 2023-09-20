package org.simplilearn.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    private String cname;
    
   

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Product> products = new ArrayList<>();



public Category() {
	// TODO Auto-generated constructor stub
}


public Category(Long cid, String cname, List<Product> products) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.products = products;
}


public Long getCid() {
	return cid;
}


public void setCid(Long cid) {
	this.cid = cid;
}


public String getCname() {
	return cname;
}


public void setCname(String cname) {
	this.cname = cname;
}


public List<Product> getProducts() {
	return products;
}


public void setProducts(List<Product> products) {
	this.products = products;
}
}