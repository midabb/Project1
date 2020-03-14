package main.model.eu;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Citizenship implements Serializable {

	private static final long serialVersionUID = 1L;

	// node
	private RegulationSummary regulationSummary;

	// attributes
	@XStreamAlias("region")
	@XStreamAsAttribute
	private String region;
	@XStreamAlias("countryIso2Code")
	@XStreamAsAttribute
	private String countryIso2Code;
	@XStreamAlias("countryDescription")
	@XStreamAsAttribute
	private String countryDescription;
	@XStreamAlias("regulationLanguage")
	@XStreamAsAttribute
	private String regulationLanguage;
	@XStreamAlias("logicalId")
	@XStreamAsAttribute
	private String logicalId;

	public RegulationSummary getRegulationSummary() {
		return regulationSummary;
	}

	public void setRegulationSummary(RegulationSummary regulationSummary) {
		this.regulationSummary = regulationSummary;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountryIso2Code() {
		return countryIso2Code;
	}

	public void setCountryIso2Code(String countryIso2Code) {
		this.countryIso2Code = countryIso2Code;
	}

	public String getCountryDescription() {
		return countryDescription;
	}

	public void setCountryDescription(String countryDescription) {
		this.countryDescription = countryDescription;
	}

	public String getRegulationLanguage() {
		return regulationLanguage;
	}

	public void setRegulationLanguage(String regulationLanguage) {
		this.regulationLanguage = regulationLanguage;
	}

	public String getLogicalId() {
		return logicalId;
	}

	public void setLogicalId(String logicalId) {
		this.logicalId = logicalId;
	}

}
