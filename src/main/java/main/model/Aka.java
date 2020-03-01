package main.model;

import java.io.Serializable;

public class Aka implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String uid;
    private String type;
    private String category;
    private String lastName;
    
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
