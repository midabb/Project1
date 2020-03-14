package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.model.eu.SanctionEntity;
import main.repo.ISanctionEntityRepo;

public class SanctionEntityService {

	@Autowired
	ISanctionEntityRepo iSanctionEntityRepo;

	public Iterable<SanctionEntity> findAll() {
		return iSanctionEntityRepo.findAll();
	}

	public List<SanctionEntity> findByRemark(String remark) {
		return iSanctionEntityRepo.findByRemark(remark);
	}

	public void saveAll(List<SanctionEntity> entities) {
		iSanctionEntityRepo.saveAll(entities);
	}

	public void deleteAll() {
		iSanctionEntityRepo.deleteAll();

	}

}
