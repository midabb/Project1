package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.model.un.Individual;
import main.repo.IIndividualRepo;

public class IndividualService {

	@Autowired
	IIndividualRepo individualRepo;

	public Iterable<Individual> findAll() {
		return individualRepo.findAll();
	}

	public List<Individual> findBySecondName(String name) {
		return individualRepo.findBySecondName(name);
	}

	public void saveAll(List<Individual> individuals) {
		individualRepo.saveAll(individuals);
	}

	public void deleteAll() {
		individualRepo.deleteAll();

	}

}
