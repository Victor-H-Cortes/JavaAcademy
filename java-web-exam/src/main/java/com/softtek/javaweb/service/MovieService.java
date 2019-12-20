package com.softtek.javaweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.javaweb.domain.model.Movie;
import com.softtek.javaweb.repository.MyRepository;

@Service
public class MovieService {
	@Autowired
	MyRepository<Movie, Integer> movieRepository;

	public Movie getOne(Integer id) {
		return movieRepository.getOne(id);
	}

	public List<Movie> list() {
		return movieRepository.list();
	}

	public int add(Movie entity) {
		return movieRepository.add(entity);
	}

	public int update(Movie entity) {
		return movieRepository.update(entity);
	}

	public void delete(Integer id) {
		movieRepository.delete(id);
	}

}
