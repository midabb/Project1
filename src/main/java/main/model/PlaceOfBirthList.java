package main.model;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class PlaceOfBirthList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XStreamImplicit(itemFieldName = "placeOfBirthItem")
	private List<PlaceOfBirthItem> placeOfBirthItems;

	public List<PlaceOfBirthItem> getPlaceOfBirthItems() {
		return placeOfBirthItems;
	}

	public void setPlaceOfBirthItems(List<PlaceOfBirthItem> placeOfBirthItems) {
		this.placeOfBirthItems = placeOfBirthItems;
	}

}
