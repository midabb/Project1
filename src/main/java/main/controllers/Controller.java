package main.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.xstream.XStream;

import main.model.SdnEntry;
import main.model.SdnList;
import main.model.eu.Export;
import main.model.eu.SanctionEntity;
import main.model.un.ConsolidatedList;
import main.model.un.Entity;
import main.model.un.Individual;
import main.service.EntityService;
import main.service.IndividualService;
import main.service.SanctionEntityService;
import main.service.SdnEntryService;
import main.utils.ConsolidatedListUtils;
import main.utils.SanctionEntityUtils;
import main.utils.SdnListUtils;

@RestController
class Controller {

	@Autowired
	SdnEntryService sdnEntryService;

	@Autowired
	IndividualService individualService;

	@Autowired
	EntityService entityService;

	@Autowired
	SanctionEntityService sanctionEntityService;

	@Autowired
	XStream xStream;

	@PostConstruct
	void init() {

		SdnListUtils sdnUtils = new SdnListUtils(xStream);
		SdnList sdnList = sdnUtils.refreshList();
		sdnEntryService.saveAll(sdnList.getSdnEntries());

		ConsolidatedListUtils consolidatedListUtils = new ConsolidatedListUtils(xStream);
		ConsolidatedList consolidatedList = consolidatedListUtils.refreshList();
		individualService.saveAll(consolidatedList.getIndividuals().getIndividuals());
		entityService.saveAll(consolidatedList.getEntities().getEntities());

		SanctionEntityUtils sanctionEntityUtils = new SanctionEntityUtils(xStream);
		Export export = sanctionEntityUtils.refreshList();
		sanctionEntityService.saveAll(export.getSanctionEntities());

	}

	// sdnList

	@RequestMapping("/all")
	Iterable<SdnEntry> findAll() {
		return sdnEntryService.findAll();

	}

	@GetMapping("/name")
	List<SdnEntry> findByLastName(@RequestParam(name = "name") String name) {

		return sdnEntryService.findByLastName(name);

	}

	@GetMapping("/refresh")
	String refresh() {
		// first delete all content from elasticsearch index
		sdnEntryService.deleteAll();

		// download and parse xml file
		SdnList list = new SdnListUtils(xStream).refreshList();

		// save all entries
		sdnEntryService.saveAll(list.getSdnEntries());

		return "SUCCESS";
	}

	// Individual List
	@RequestMapping("/allIndividuals")
	Iterable<Individual> findAllIndividuals() {
		return individualService.findAll();
	}

	@GetMapping("/nameIndividual")
	List<Individual> findBySecondName(@RequestParam(name = "name") String name) {
		return individualService.findBySecondName(name);
	}

	@GetMapping("/refreshIndividual")
	String refreshIndividuals() {
		individualService.deleteAll();

		ConsolidatedList conList = new ConsolidatedListUtils(xStream).refreshList();
		individualService.saveAll(conList.getIndividuals().getIndividuals());

		return "SUCCESS";
	}

	// Entities List
	@RequestMapping("/allEntities")
	Iterable<Entity> findAllEntities() {
		return entityService.findAll();
	}

	@GetMapping("/nameEntity")
	List<Entity> findByFirstName(@RequestParam(name = "name") String name) {
		return entityService.findByFirstName(name);
	}

	@GetMapping("/refreshEntities")
	String refreshEntities() {
		individualService.deleteAll();

		ConsolidatedList conList = new ConsolidatedListUtils(xStream).refreshList();
		entityService.saveAll(conList.getEntities().getEntities());

		return "SUCCESS";
	}

	// Sanction Entities List
	@RequestMapping("/allSanctionEntities")
	Iterable<SanctionEntity> findAllSanctionEntities() {
		return sanctionEntityService.findAll();
	}

	@GetMapping("/nameSanctionEntity")
	List<SanctionEntity> findSanctionEntityByLastName(@RequestParam(name = "remark") String remark) {
		return sanctionEntityService.findByRemark(remark);
	}

	@GetMapping("/refreshSanctionEntities")
	String refreshSanctionEntities() {
		// first delete all content from elasticsearch index
		sanctionEntityService.deleteAll();

		// download and parse xml file
		Export export = new SanctionEntityUtils(xStream).refreshList();

		// save all entries
		sanctionEntityService.saveAll(export.getSanctionEntities());

		return "SUCCESS";
	}
}