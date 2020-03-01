package main.model;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("sdnList")
public class SdnList implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@XStreamAlias(value="publshInformation")
	private PublshInformation publshInformation;
	
	@XStreamImplicit(itemFieldName = "sdnEntry")
	private List<SdnEntry> sdnEntries;

	public List<SdnEntry> getSdnEntries() {
		return sdnEntries;
	}

	public void setSdnEntries(List<SdnEntry> sdnEntries) {
		this.sdnEntries = sdnEntries;
	}

	public PublshInformation getPublshInformation() {
		return publshInformation;
	}

	public void setPublshInformation(PublshInformation publshInformation) {
		this.publshInformation = publshInformation;
	}

}
