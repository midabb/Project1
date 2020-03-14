package main.model.un;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("ENTITIES")
public class Entities implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamImplicit(itemFieldName = "ENTITY")
	private List<Entity> entities;

	public List<Entity> getEntities() {
		return entities;
	}

	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

}
