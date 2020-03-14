package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.model.un.Entity;
import main.repo.IEntityRepo;

public class EntityService {
	
	@Autowired
	IEntityRepo iEntityRepo;
	
	public Iterable<Entity> findAll() {
		return iEntityRepo.findAll();
	}

	public List<Entity> findByFirstName(String name) {
		return iEntityRepo.findByFirstName(name);
	}

	public void saveAll(List<Entity> entities) {
		iEntityRepo.saveAll(entities);
	}

	public void deleteAll() {
		iEntityRepo.deleteAll();

	}

}
