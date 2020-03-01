package main.controllers;

import java.io.File;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.xstream.XStream;

import main.model.PublshInformation;
import main.model.SdnEntry;
import main.model.SdnList;
import main.service.SdnEntryService;

@RestController
class Controller {

	@Autowired
	SdnEntryService sdnEntryService;
	
	@Autowired
	XStream xStream;

	@PostConstruct
	void init() {

//		File file = new File("path/to/sdn.xml/from/main/resources");
//
//		xStream.alias("sdnList", SdnList.class);
//		xStream.alias("publshInformation", PublshInformation.class);
//		xStream.alias("sdnEntry", SdnEntry.class);
//		// xStream.alias("sdnEntry", SdnEntry.class);
//		SdnList sdnList = null;
//		try {
//
//			sdnList = (SdnList) xStream.fromXML(file);
//		} catch (Exception e) {
//			e.getMessage();
//		}
//
//		sdnEntryService.saveAll(sdnList.getSdnEntries());

	}

	@RequestMapping("/all")
	Iterable<SdnEntry> findAll() {
		return sdnEntryService.findAll();

	}

	@GetMapping("/name")
	List<SdnEntry> findByLastName(@RequestParam(name="name") String name) {

		return sdnEntryService.findByLastName(name);

	}
}