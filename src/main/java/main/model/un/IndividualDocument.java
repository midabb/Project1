package main.model.un;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class IndividualDocument implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XStreamAlias(value = "TYPE_OF_DOCUMENT")
	private String typeOfDocument;
	@XStreamAlias(value = "NUMBER")
	private String number;

	public String getTypeOfDocument() {
		return typeOfDocument;
	}

	public void setTypeOfDocument(String typeOfDocument) {
		this.typeOfDocument = typeOfDocument;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
