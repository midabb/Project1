package main.model;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class ProgramList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XStreamImplicit(itemFieldName = "program")
	private List<String> programs;

	public List<String> getPrograms() {
		return programs;
	}

	public void setPrograms(List<String> programs) {
		this.programs = programs;
	}
	
}