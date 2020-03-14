package main.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;

import com.thoughtworks.xstream.XStream;

import main.model.PublshInformation;
import main.model.SdnEntry;
import main.model.SdnList;
import main.model.eu.Export;
import main.model.eu.SanctionEntity;

public class SanctionEntityUtils {

	private static final String path = "/Users/mida/Desktop/sanctionEntities.xml";

	private XStream xStream;

	public SanctionEntityUtils(XStream xStream) {
		this.xStream = xStream;
	}

	public Export refreshList() {

		try (BufferedInputStream inputStream = new BufferedInputStream(new URL(
				"https://webgate.ec.europa.eu/europeaid/fsd/fsf/public/files/xmlFullSanctionsList_1_1/content?token=n00386yt")
						.openStream());
				FileOutputStream fileOS = new FileOutputStream(path)) {

			byte data[] = new byte[1024];
			int byteContent;

			while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
				fileOS.write(data, 0, byteContent);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return parseXMLFile();

	}

	public Export parseXMLFile() {

		File file = new File(path);

		xStream.alias("export", Export.class);
		xStream.alias("sanctionEntity", SanctionEntity.class);
		Export export = null;
		try {

			export = (Export) xStream.fromXML(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return export;
	}

	public void setxStream(XStream xStream) {
		this.xStream = xStream;
	}

	public XStream getxStream() {
		return xStream;
	}
}
