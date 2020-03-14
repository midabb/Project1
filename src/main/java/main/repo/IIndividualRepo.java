package main.repo;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import main.model.un.Individual;

public interface IIndividualRepo extends ElasticsearchRepository<Individual, String> {

	List<Individual> findBySecondName(String secondName);

}
