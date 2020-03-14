package main.repo;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import main.model.un.Entity;

public interface IEntityRepo extends ElasticsearchRepository<Entity, String> {
	
	List<Entity> findByFirstName(String firstName);

}
