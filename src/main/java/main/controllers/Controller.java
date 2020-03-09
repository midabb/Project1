package main.controllers;

import java.io.BufferedInputStream;
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
import main.service.SdnEntryService;
import main.utils.SdnListUtils;

@RestController
class Controller {

	@Autowired
	SdnEntryService sdnEntryService;

	@Autowired
	XStream xStream;

	@PostConstruct
	void init() {

		SdnListUtils sdnUtils = new SdnListUtils(xStream);
		SdnList sdnList = sdnUtils.refreshList();
		sdnEntryService.saveAll(sdnList.getSdnEntries());

	}

	@RequestMapping("/all")
	Iterable<SdnEntry> findAll() {
		return sdnEntryService.findAll();

	}

	@GetMapping("/name")
	List<SdnEntry> findByLastName(@RequestParam(name = "name") String name) {

		return sdnEntryService.findByLastName(name);

	}

	@GetMapping("/refresh")
	void refresh() {
		// first delete all content from elasticsearch index
		sdnEntryService.deleteAll();

		// download and parse xml file
		SdnList list = new SdnListUtils(xStream).refreshList();

		// save all entries
		sdnEntryService.saveAll(list.getSdnEntries());
	}

}