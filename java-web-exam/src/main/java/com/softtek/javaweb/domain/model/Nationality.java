package com.softtek.javaweb.domain.model;

public class Nationality {
	String nationalityId;
	String description;
	
	public Nationality(String nationalityId, String description) {
		super();
		this.nationalityId = nationalityId;
		this.description = description;
	}	
	public Nationality() {}

	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Nationality [nationalityId=" + nationalityId + ", description=" + description + "]";
	}
	
	
}
