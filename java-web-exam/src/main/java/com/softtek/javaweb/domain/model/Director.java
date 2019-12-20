package com.softtek.javaweb.domain.model;

public class Director {
	int directorId;
	String name;
	Genre genre;
	Nationality nationality;
		
	public Director() {}
	public Director(int directorId, String name, Genre genre, Nationality nationality) {
		super();
		this.directorId = directorId;
		this.name = name;
		this.genre = genre;
		this.nationality = nationality;
	}
	
	public int getDirectorId() {
		return directorId;
	}
	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Nationality getNationality() {
		return nationality;
	}
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "Director [directorId=" + directorId + ", name=" + name + ", genre=" + genre != null ? genre.toString() : null + ", nationality="
				+ nationality != null ? nationality.toString() : null + "]";
	}
}
