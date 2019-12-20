package com.softtek.javaweb.domain.model;

public class Genre {
	Integer genreId;
	String description;

	public Genre(Integer genreId, String description) {
		super();
		this.genreId = genreId;
		this.description = description;
	}
	public Genre() {}
	
	public Integer getGenreId() {
		return genreId;
	}
	public void setGenreId(Integer genreId) {
		this.genreId = genreId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Genre [genreId=" + genreId + ", description=" + description + "]";
	}
}
