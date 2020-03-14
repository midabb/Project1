package main.model.un;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("INDIVIDUALS")
public class Individuals implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamImplicit(itemFieldName = "INDIVIDUAL")
	private List<Individual> individuals;

	public List<Individual> getIndividuals() {
		return individuals;
	}

	public void setIndividuals(List<Individual> individuals) {
		this.individuals = individuals;
	}

}
