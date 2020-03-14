package main.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Document(indexName = "entries", type = "entry", shards = 2)
public class SdnEntry implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String uid;
	private String firstName;
	private String lastName;
	private String sdnType;
	private String remarks;

	@XStreamAlias( value = "programList")
	private ProgramList programList;

	private IdList idList;
	private DateOfBirthList dateOfBirthList;
	private PlaceOfBirthList placeOfBirthList;
	private AkaList akaList;
	private AddressList addressList;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSdnType() {
		return sdnType;
	}
	public void setSdnType(String sdnType) {
		this.sdnType = sdnType;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public IdList getIdList() {
		return idList;
	}
	public void setIdList(IdList idList) {
		this.idList = idList;
	}
	public DateOfBirthList getDateOfBirthList() {
		return dateOfBirthList;
	}
	public void setDateOfBirthList(DateOfBirthList dateOfBirthList) {
		this.dateOfBirthList = dateOfBirthList;
	}
	public PlaceOfBirthList getPlaceOfBirthList() {
		return placeOfBirthList;
	}
	public void setPlaceOfBirthList(PlaceOfBirthList placeOfBirthList) {
		this.placeOfBirthList = placeOfBirthList;
	}
	public AkaList getAkaList() {
		return akaList;
	}
	public void setAkaList(AkaList akaList) {
		this.akaList = akaList;
	}
	public AddressList getAddressList() {
		return addressList;
	}
	public void setAddressList(AddressList addressList) {
		this.addressList = addressList;
	}
	public ProgramList getProgramList() {
		return programList;
	}
	public void setProgramList(ProgramList programList) {
		this.programList = programList;
	}



}
