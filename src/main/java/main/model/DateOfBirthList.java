package main.model;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class DateOfBirthList implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XStreamImplicit(itemFieldName = "dateOfBirthItem")
	private List<DateOfBirthItem> dateOfBirthItems;

	public List<DateOfBirthItem> getDateOfBirthItems() {
		return dateOfBirthItems;
	}

	public void setDateOfBirthItems(List<DateOfBirthItem> dateOfBirthItems) {
		this.dateOfBirthItems = dateOfBirthItems;
	}
}
