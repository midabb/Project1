package main.model;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class IdList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XStreamImplicit(itemFieldName = "id")
	private List<Id> ids;

	public List<Id> getIds() {
		return ids;
	}

	public void setIds(List<Id> ids) {
		this.ids = ids;
	}
}
