package main.model.eu;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Birthday implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//nodes
	private RegulationSummary regulationSummary;
	
	//attributes
	@XStreamAsAttribute
	private String circa;
	@XStreamAsAttribute
	private String calendarType;
	@XStreamAsAttribute
	private String city;
	@XStreamAsAttribute
	private String zipCode;
	@XStreamAsAttribute
	private String birthdate;
	@XStreamAsAttribute
	private String dayOfMonth;
	@XStreamAsAttribute
	private String monthOfYear;
	@XStreamAsAttribute
	private String year;
	@XStreamAsAttribute
	private String region;
	@XStreamAsAttribute
	private String place;
	@XStreamAsAttribute
	private String countryIso2Code;
	@XStreamAsAttribute
	private String countryDescription;
	@XStreamAsAttribute
	private String regulationLanguage;
	@XStreamAsAttribute
	private String logicalId;

	public RegulationSummary getRegulationSummary() {
		return regulationSummary;
	}

	public void setRegulationSummary(RegulationSummary regulationSummary) {
		this.regulationSummary = regulationSummary;
	}

}
