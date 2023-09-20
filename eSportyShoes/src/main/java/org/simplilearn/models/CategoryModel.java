package org.simplilearn.models;

public class CategoryModel {

	private int cid;
	private String cname;
	public CategoryModel() {
		// TODO Auto-generated constructor stub
	}
	public CategoryModel(String name) {
		super();
		this.cid = cid;
		this.cname = name;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return cname;
	}
	public void setName(String name) {
		this.cname = name;
	}
}
