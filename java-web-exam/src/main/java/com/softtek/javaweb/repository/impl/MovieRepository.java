package com.softtek.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softtek.javaweb.domain.model.Director;
import com.softtek.javaweb.domain.model.Genre;
import com.softtek.javaweb.domain.model.Movie;
import com.softtek.javaweb.jdbc.DriverManagerDatabase;
import com.softtek.javaweb.repository.MyRepository;

@Repository
public class MovieRepository implements MyRepository<Movie, Integer> {

	@Autowired
	MyRepository<Genre, Integer> genreRepository;
	@Autowired
	MyRepository<Director, Integer> directorRepository;
	
	@Override
	public Movie getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> list() {
		List<Movie> movies = new ArrayList<>();
		
		StringBuilder sql = new StringBuilder();

		sql.append("SELECT id, title, genre_id, director_id, rating ");
		sql.append("FROM movie");

		try 
		( 
			Connection connection = DriverManagerDatabase.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql.toString());				
		) {
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				movies.add(this.buildEntity(result)); 
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return movies;
	}

	@Override
	public int add(Movie entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Movie entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	private Movie buildEntity(ResultSet result) throws SQLException {
		Movie movie = new Movie();

		movie.setMovieId(result.getInt("id"));
		movie.setTitle(result.getString("title"));
		movie.setGenre(genreRepository.getOne(result.getInt("genre_id")));
		movie.setDirector(directorRepository.getOne(result.getInt("director_id")));
		movie.setRating(result.getInt("rating"));

		return movie;
	}
}
