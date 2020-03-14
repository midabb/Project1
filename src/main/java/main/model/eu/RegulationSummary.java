package main.model.eu;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class RegulationSummary implements Serializable {

	private static final long serialVersionUID = 1L;

	// attributes
	@XStreamAsAttribute
	private String regulationType;
	@XStreamAsAttribute
	private String publicationDate;
	@XStreamAsAttribute
	private String numberTitle;
	@XStreamAsAttribute
	private String publicationUrl;

	public String getRegulationType() {
		return regulationType;
	}

	public void setRegulationType(String regulationType) {
		this.regulationType = regulationType;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getNumberTitle() {
		return numberTitle;
	}

	public void setNumberTitle(String numberTitle) {
		this.numberTitle = numberTitle;
	}

	public String getPublicationUrl() {
		return publicationUrl;
	}

	public void setPublicationUrl(String publicationUrl) {
		this.publicationUrl = publicationUrl;
	}

}
