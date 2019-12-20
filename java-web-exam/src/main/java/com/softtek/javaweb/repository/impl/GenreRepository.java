package com.softtek.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softtek.javaweb.domain.model.Genre;
import com.softtek.javaweb.jdbc.DriverManagerDatabase;
import com.softtek.javaweb.repository.MyRepository;

@Repository
public class GenreRepository implements MyRepository<Genre, Integer> {

	@Override
	public Genre getOne(Integer id) {
		Genre genre = new Genre();
		
		StringBuilder sql = new StringBuilder();

		sql.append("SELECT genre_id, description ");
		sql.append("FROM genre ");
		sql.append("WHERE genre_id = ?");

		try 
		( 
			Connection connection = DriverManagerDatabase.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql.toString());				
		) {
			ps.setInt(1, id);
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				genre = this.buildEntity(result);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return genre;
	}

	@Override
	public List<Genre> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Genre entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Genre entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}
	private Genre buildEntity(ResultSet result) throws SQLException {
		Genre genre = new Genre();
		
		genre.setGenreId(result.getInt("genre_id"));
		genre.setDescription(result.getString("description"));
		
		return genre;
	}

}
