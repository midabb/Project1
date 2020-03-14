package main.model.un;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "entities", type = "entity", shards = 2)
public class Entity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String dataId;
	private String versionNum;
	private String firstName;
	private String unListType;
	private String referenceNumber;
	private String listedOn;
	private String comments1;
	private String sortKey;
	private String sortKeyLastMod;
	private ListType listType;
	private LastDayUpdated lastDayUpdated;
	private EntityAlias entityAlias;
	private EntityAddress entityAddress;

	public String getDataId() {
		return dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getVersionNum() {
		return versionNum;
	}

	public void setVersionNum(String versionNum) {
		this.versionNum = versionNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUnListType() {
		return unListType;
	}

	public void setUnListType(String unListType) {
		this.unListType = unListType;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getListedOn() {
		return listedOn;
	}

	public void setListedOn(String listedOn) {
		this.listedOn = listedOn;
	}

	public String getComments1() {
		return comments1;
	}

	public void setComments1(String comments1) {
		this.comments1 = comments1;
	}

	public String getSortKey() {
		return sortKey;
	}

	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}

	public String getSortKeyLastMod() {
		return sortKeyLastMod;
	}

	public void setSortKeyLastMod(String sortKeyLastMod) {
		this.sortKeyLastMod = sortKeyLastMod;
	}

	public ListType getListType() {
		return listType;
	}

	public void setListType(ListType listType) {
		this.listType = listType;
	}

	public LastDayUpdated getLastDayUpdated() {
		return lastDayUpdated;
	}

	public void setLastDayUpdated(LastDayUpdated lastDayUpdated) {
		this.lastDayUpdated = lastDayUpdated;
	}

	public EntityAlias getEntityAlias() {
		return entityAlias;
	}

	public void setEntityAlias(EntityAlias entityAlias) {
		this.entityAlias = entityAlias;
	}

	public EntityAddress getEntityAddress() {
		return entityAddress;
	}

	public void setEntityAddress(EntityAddress entityAddress) {
		this.entityAddress = entityAddress;
	}

}
