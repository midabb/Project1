package main.model.un;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class IndividualAdress implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamAlias(value = "COUNTRY")
	public String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
