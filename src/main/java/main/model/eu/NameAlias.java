package main.model.eu;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class NameAlias implements Serializable {

	private static final long serialVersionUID = 1L;

	// node
	private RegulationSummary regulationSummary;

	// attributes
	@XStreamAsAttribute
	private String firstName;
	@XStreamAsAttribute
	private String middleName;
	@XStreamAsAttribute
	private String lastName;
	@XStreamAsAttribute
	private String wholeName;
	@XStreamAsAttribute
	private String function;
	@XStreamAsAttribute
	private String title;
	@XStreamAsAttribute
	private String nameLanguage;
	@XStreamAsAttribute
	private String strong;
	@XStreamAsAttribute
	private String regulationLanguage;
	@XStreamAsAttribute
	private String logicalId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getWholeName() {
		return wholeName;
	}

	public void setWholeName(String wholeName) {
		this.wholeName = wholeName;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNameLanguage() {
		return nameLanguage;
	}

	public void setNameLanguage(String nameLanguage) {
		this.nameLanguage = nameLanguage;
	}

	public String getStrong() {
		return strong;
	}

	public void setStrong(String strong) {
		this.strong = strong;
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

	public RegulationSummary getRegulationSummary() {
		return regulationSummary;
	}

	public void setRegulationSummary(RegulationSummary regulationSummary) {
		this.regulationSummary = regulationSummary;
	}

}
