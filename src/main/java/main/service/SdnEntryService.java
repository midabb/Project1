package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.model.SdnEntry;
import main.repo.ISdnEntryRepo;

public class SdnEntryService {

	@Autowired
	ISdnEntryRepo iSdnEntryRepo;

	public Iterable<SdnEntry> findAll() {
		return iSdnEntryRepo.findAll();
	}

	public List<SdnEntry> findByLastName(String name) {
		return iSdnEntryRepo.findByLastName(name);
	}

	public void saveAll(List<SdnEntry> entries) {
		iSdnEntryRepo.saveAll(entries);
	}

	public void deleteAll() {
		iSdnEntryRepo.deleteAll();

	}

}
