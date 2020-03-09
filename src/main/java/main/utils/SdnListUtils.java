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

public class SdnListUtils {

	private XStream xStream;

	public SdnListUtils(XStream xStream) {
		this.xStream = xStream;
	}

	public SdnList refreshList() {

		try (BufferedInputStream inputStream = new BufferedInputStream(
				new URL("https://www.treasury.gov/ofac/downloads/sdn.xml").openStream());
				FileOutputStream fileOS = new FileOutputStream(
						"path_to_folder_where_to_download_sdn.xml_file")) {

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

	public SdnList parseXMLFile() {

		File file = new File("path_to_folder_where_you_downloaded_sdn.xml_file");

		xStream.alias("sdnList", SdnList.class);
		xStream.alias("publshInformation", PublshInformation.class);
		xStream.alias("sdnEntry", SdnEntry.class);
		SdnList sdnList = null;
		try {

			sdnList = (SdnList) xStream.fromXML(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return sdnList;
	}

	public void setxStream(XStream xStream) {
		this.xStream = xStream;
	}

	public XStream getxStream() {
		return xStream;
	}
}