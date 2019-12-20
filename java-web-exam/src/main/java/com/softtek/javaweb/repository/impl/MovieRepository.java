package com.softtek.javaweb.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.softtek.javaweb.domain.model.Movie;
import com.softtek.javaweb.repository.MyRepository;

@Repository
public class MovieRepository implements MyRepository<Movie, Integer> {

	@Override
	public Movie getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> list() {
		// TODO Auto-generated method stub
		return null;
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

}
