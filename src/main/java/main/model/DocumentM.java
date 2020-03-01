package main.model;

//@Document (indexName="document")
public class DocumentM {
	// @Transient
	private String title;
	// @Id
	private String name;

	public DocumentM() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
