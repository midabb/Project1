package main.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;

import com.thoughtworks.xstream.XStream;

import main.model.un.ConsolidatedList;
import main.model.un.Entities;
import main.model.un.Entity;
import main.model.un.Individual;
import main.model.un.Individuals;

public class ConsolidatedListUtils {
	
	private static final String path = "/Users/mida/Desktop/consolidatedList.xml";

	private XStream xStream;

	public ConsolidatedListUtils(XStream xStream) {
		this.xStream = xStream;
	}

	public ConsolidatedList refreshList() {

		try (BufferedInputStream inputStream = new BufferedInputStream(
				new URL("https://scsanctions.un.org/resources/xml/en/consolidated.xml").openStream());
				FileOutputStream fileOutputStream = new FileOutputStream(path)) {

			byte data[] = new byte[1024];
			int byteContent;

			while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
				fileOutputStream.write(data, 0, byteContent);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return parseXMLFile();
	}

	public ConsolidatedList parseXMLFile() {

		File file = new File(path);

		xStream.alias("CONSOLIDATED_LIST", ConsolidatedList.class);
		xStream.alias("INDIVIDUALS", Individuals.class);
		xStream.alias("ENTITIES", Entities.class);
		xStream.alias("ENTITY", Entity.class);
		xStream.alias("INDIVIDUAL", Individual.class);
		
		ConsolidatedList consolidatedList = null;

		try {
			consolidatedList = (ConsolidatedList) xStream.fromXML(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return consolidatedList;
	}

	public XStream getxStream() {
		return xStream;
	}

	public void setxStream(XStream xStream) {
		this.xStream = xStream;
	}
}
