package com.softtek.javaweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.javaweb.domain.model.Nationality;
import com.softtek.javaweb.repository.MyRepository;

@Service
public class NationalityService {
	@Autowired
	MyRepository<Nationality, String> nationalityRepository;

	public Nationality getOne(String id) {
		return nationalityRepository.getOne(id);
	}

	public List<Nationality> list() {
		return nationalityRepository.list();
	}

	public int add(Nationality entity) {
		return nationalityRepository.add(entity);
	}

	public int update(Nationality entity) {
		return nationalityRepository.update(entity);
	}

	public void delete(String id) {
		nationalityRepository.delete(id);
	}

}
