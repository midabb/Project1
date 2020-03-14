package main.model.un;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class IndividualDateOfBirth implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamAlias(value = "TYPE_OF_DATE")
	private String typeOfDate;
	@XStreamAlias(value = "DATE")
	private String date;

	public String getTypeOfDate() {
		return typeOfDate;
	}

	public void setTypeOfDate(String typeOfDate) {
		this.typeOfDate = typeOfDate;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
