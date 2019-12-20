package com.softtek.javaweb.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.softtek.javaweb.domain.model.Genre;
import com.softtek.javaweb.repository.MyRepository;

@Repository
public class GenreRepository implements MyRepository<Genre, Integer> {

	@Override
	public Genre getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
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

}
