package main.model.eu;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Regulation implements Serializable {

	private static final long serialVersionUID = 1L;

	// node
	private String publicationUrl;

	// attributes
	@XStreamAsAttribute
	private String regulationType;
	@XStreamAsAttribute
	private String organisationType;
	@XStreamAsAttribute
	private String publicationDate;
	@XStreamAsAttribute
	private String entryIntoForceDate;
	@XStreamAsAttribute
	private String numberTitle;
	@XStreamAsAttribute
	private String programme;
	@XStreamAsAttribute
	private String logicalId;

	public String getPublicationUrl() {
		return publicationUrl;
	}

	public void setPublicationUrl(String publicationUrl) {
		this.publicationUrl = publicationUrl;
	}

	public String getRegulationType() {
		return regulationType;
	}

	public void setRegulationType(String regulationType) {
		this.regulationType = regulationType;
	}

	public String getOrganisationType() {
		return organisationType;
	}

	public void setOrganisationType(String organisationType) {
		this.organisationType = organisationType;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getEntryIntoForceDate() {
		return entryIntoForceDate;
	}

	public void setEntryIntoForceDate(String entryIntoForceDate) {
		this.entryIntoForceDate = entryIntoForceDate;
	}

	public String getNumberTitle() {
		return numberTitle;
	}

	public void setNumberTitle(String numberTitle) {
		this.numberTitle = numberTitle;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public String getLogicalId() {
		return logicalId;
	}

	public void setLogicalId(String logicalId) {
		this.logicalId = logicalId;
	}

}
