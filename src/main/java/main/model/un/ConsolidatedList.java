package main.model.un;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("CONSOLIDATED_LIST")
public class ConsolidatedList implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamAlias(value = "INDIVIDUALS")
	private Individuals individuals;
	
	@XStreamAlias(value = "ENTITIES")
	private Entities entities;

	public Individuals getIndividuals() {
		return individuals;
	}

	public void setIndividuals(Individuals individuals) {
		this.individuals = individuals;
	}

	public Entities getEntities() {
		return entities;
	}

	public void setEntities(Entities entities) {
		this.entities = entities;
	}

}
