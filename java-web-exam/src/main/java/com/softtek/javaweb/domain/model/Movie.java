package com.softtek.javaweb.domain.model;

public class Movie {
	Integer movieId;
	String title;
	Genre genre;
	Director director;
	Integer rating;
		
	public Movie() {};
	public Movie(Integer movieId, String title, Genre genre, Director director, Integer rating) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.rating = rating;
	}
	
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", genre=" + genre != null ? genre.toString() : null  + ", director=" + director != null ? director.toString() : null 
				+ ", rating=" + rating + "]";
	}
	
	
}
