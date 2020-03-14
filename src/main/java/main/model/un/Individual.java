package main.model.un;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Document(indexName = "individuals", type = "individual", shards = 2)
public class Individual implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String dataId;
	private String versionNum;
	private String firstName;
	private String secondName;
	private String thirdName;
	private String unListType;
	private String referenceNumber;
	private String listedOn;
	private String comments1;
	private String individualPlaceOfBirth;
	private String sortKey;
	private String sortKeyLastMod;
	private Designation designation;
	private Nationality nationality;
	private ListType listType;
	private LastDayUpdated listDayUpdated;
	private IndividualAlias individualAlias;
	private IndividualAdress individualAdress;
	private IndividualDateOfBirth individualDateOfBirth;
	private IndividualDocument individualDocument;

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

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getThirdName() {
		return thirdName;
	}

	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
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

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	public ListType getListType() {
		return listType;
	}

	public void setListType(ListType listType) {
		this.listType = listType;
	}

	public LastDayUpdated getListDayUpdated() {
		return listDayUpdated;
	}

	public void setListDayUpdated(LastDayUpdated listDayUpdated) {
		this.listDayUpdated = listDayUpdated;
	}

	public IndividualAlias getIndividualAlias() {
		return individualAlias;
	}

	public void setIndividualAlias(IndividualAlias individualAlias) {
		this.individualAlias = individualAlias;
	}

	public IndividualAdress getIndividualAdress() {
		return individualAdress;
	}

	public void setIndividualAdress(IndividualAdress individualAdress) {
		this.individualAdress = individualAdress;
	}

	public IndividualDateOfBirth getIndividualDateOfBirth() {
		return individualDateOfBirth;
	}

	public void setIndividualDateOfBirth(IndividualDateOfBirth individualDateOfBirth) {
		this.individualDateOfBirth = individualDateOfBirth;
	}

	public IndividualDocument getIndividualDocument() {
		return individualDocument;
	}

	public void setIndividualDocument(IndividualDocument individualDocument) {
		this.individualDocument = individualDocument;
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

	public String getIndividualPlaceOfBirth() {
		return individualPlaceOfBirth;
	}

	public void setIndividualPlaceOfBirth(String individualPlaceOfBirth) {
		this.individualPlaceOfBirth = individualPlaceOfBirth;
	}

}
