package main.model.un;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class EntityAlias implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XStreamAlias(value = "QUALITY")
	private String quality;
	@XStreamAlias(value = "ALIAS_NAME")
	private String aliasName;

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

}
