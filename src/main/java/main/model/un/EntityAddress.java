package main.model.un;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class EntityAddress implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XStreamAlias(value = "CITY")
	private String city;
	@XStreamAlias(value = "COUNTRY")
	private String country;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
