package org.simplilearn.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    private String shoe;
    private int price;
	private String imageUrl;
	@ManyToOne
    @JoinColumn(name = "category_cid") 
    private Category category;
public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int pid, String shoe, int price, String imageUrl, Category category) {
	super();
	this.pid = pid;
	this.shoe = shoe;
	this.price = price;
	this.imageUrl = imageUrl;
	this.category = category;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getShoe() {
	return shoe;
}
public void setShoe(String shoe) {
	this.shoe = shoe;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getImageUrl() {
	return imageUrl;
}
public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
}