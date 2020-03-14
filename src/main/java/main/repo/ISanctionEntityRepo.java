package main.repo;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import main.model.eu.SanctionEntity;

public interface ISanctionEntityRepo extends ElasticsearchRepository<SanctionEntity, String> {

	List<SanctionEntity> findByRemark(String remark);
}
