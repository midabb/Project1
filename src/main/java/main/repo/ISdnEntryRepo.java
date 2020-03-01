package main.repo;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import main.model.SdnEntry;

public interface ISdnEntryRepo extends ElasticsearchRepository<SdnEntry, String>{
	
	List<SdnEntry> findByLastName(String lastName);
	
}
