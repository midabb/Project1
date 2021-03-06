package main.model.un;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class Nationality implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XStreamImplicit(itemFieldName = "VALUE")
	private List<String> values;

	public List<String> getValues() {
		return values;
	}

	public void setValue(List<String> values) {
		this.values = values;
	}

}
