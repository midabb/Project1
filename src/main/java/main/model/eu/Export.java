package main.model.eu;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("export")
public class Export implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamImplicit(itemFieldName = "sanctionEntity")
	private List<SanctionEntity> sanctionEntities;

	public List<SanctionEntity> getSanctionEntities() {
		return sanctionEntities;
	}

	public void setSanctionEntities(List<SanctionEntity> sanctionEntities) {
		this.sanctionEntities = sanctionEntities;
	}
}
