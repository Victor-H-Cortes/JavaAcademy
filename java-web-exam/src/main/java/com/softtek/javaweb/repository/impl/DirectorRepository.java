package com.softtek.javaweb.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.softtek.javaweb.domain.model.Director;
import com.softtek.javaweb.repository.MyRepository;

@Repository
public class DirectorRepository implements MyRepository<Director, Integer> {

	@Override
	public Director getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
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

}
