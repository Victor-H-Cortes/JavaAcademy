package com.softtek.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.softtek.javaweb.domain.model.Nationality;
import com.softtek.javaweb.jdbc.DriverManagerDatabase;
import com.softtek.javaweb.repository.MyRepository;

@Repository
public class NationalityRepository implements MyRepository<Nationality, String> {

	@Override
	public Nationality getOne(String id) {
		Nationality nationality = new Nationality();
		
		StringBuilder sql = new StringBuilder();

		sql.append("SELECT nationality_id, description ");
		sql.append("FROM nationality ");
		sql.append("WHERE nationality_id = ?");

		try 
		( 
			Connection connection = DriverManagerDatabase.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql.toString());				
		) {
			ps.setString(1, id);
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				nationality = this.buildEntity(result);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return nationality;
	}

	@Override
	public List<Nationality> list() {
		List<Nationality> nationalities = new ArrayList<>();
		
		StringBuilder sql = new StringBuilder();

		sql.append("SELECT nationality_id, description ");
		sql.append("FROM nationality ");

		try 
		( 
			Connection connection = DriverManagerDatabase.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql.toString());				
		) {
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				nationalities.add(this.buildEntity(result)); 
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return nationalities;
	}

	@Override
	public int add(Nationality entity) {
		int status = 0;
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO nationality ");
		sql.append("(nationality_id, description) ");
		sql.append("VALUES (?, ?)");
		
		try (
			Connection connection = DriverManagerDatabase.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql.toString());
		) {
			ps.setString(1, entity.getNationalityId());
			ps.setString(2, entity.getDescription());
			status = ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return status;	
	}

	@Override
	public int update(Nationality entity) {
		int status = 0;
		
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE nationality ");
		sql.append("SET description = ? ");
		sql.append("WHERE nationality_id = ?");
		
		try (
			Connection connection = DriverManagerDatabase.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql.toString());
		) {
			ps.setString(1, entity.getDescription());			
			ps.setString(2, entity.getNationalityId());			
			status = ps.executeUpdate();			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return status;	
	}

	@Override
	public int delete(String id) {
		int status = 0;
		
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM nationality ");
		sql.append("WHERE nationality_id = ?");
		
		try (
			Connection connection = DriverManagerDatabase.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql.toString());
		) {
			ps.setString(1, id);
			status = ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return status;	
	}

	private Nationality buildEntity(ResultSet result) throws SQLException {
		Nationality nationality = new Nationality();
		nationality.setNationalityId(result.getString("nationality_id"));
		nationality.setDescription(result.getString("description"));
		
		return nationality;
	}
}
