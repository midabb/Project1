package main.model;

import java.io.Serializable;

public class PublshInformation  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String Publish_Date;
	private String Record_Count;

	public String getPublish_Date() {
		return Publish_Date;
	}

	public void setPublish_Date(String publish_Date) {
		Publish_Date = publish_Date;
	}

	public String getRecord_Count() {
		return Record_Count;
	}

	public void setRecord_Count(String record_Count) {
		Record_Count = record_Count;
	}

}
