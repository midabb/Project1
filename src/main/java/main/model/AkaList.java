package main.model;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class AkaList {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XStreamImplicit(itemFieldName = "aka")
	private List<Aka> akas;

	public List<Aka> getAkas() {
		return akas;
	}

	public void setAkas(List<Aka> akas) {
		this.akas = akas;
	}
}
