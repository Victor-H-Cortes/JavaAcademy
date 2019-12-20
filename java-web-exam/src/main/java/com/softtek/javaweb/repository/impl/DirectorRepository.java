package com.softtek.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softtek.javaweb.domain.model.Director;
import com.softtek.javaweb.jdbc.DriverManagerDatabase;
import com.softtek.javaweb.repository.MyRepository;

@Repository
public class DirectorRepository implements MyRepository<Director, Integer> {

	@Override
	public Director getOne(Integer id) {
		Director director = new Director();
		
		StringBuilder sql = new StringBuilder();

		sql.append("SELECT director_id, name ");
		sql.append("FROM director ");
		sql.append("WHERE director_id = ?");

		try 
		( 
			Connection connection = DriverManagerDatabase.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql.toString());				
		) {
			ps.setInt(1, id);
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				director = this.buildEntity(result);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return director;
	}

	@Override
	public List<Director> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Director entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Director entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}
	private Director buildEntity(ResultSet result) throws SQLException {
		Director director = new Director();
		
		director.setDirectorId(result.getInt("director_id"));
		director.setName(result.getString("name"));
		
		return director;
	}

}
