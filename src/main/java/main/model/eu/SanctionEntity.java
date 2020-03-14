package main.model.eu;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Document(indexName = "sanctions", type = "sanction", shards = 2)
public class SanctionEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	// nodes
	@XStreamImplicit(itemFieldName = "remark")
	private List<String> remark;
	private String subjectType;
	private Regulation regulation;
	@XStreamImplicit(itemFieldName = "citizenship")
	private List<Citizenship> citizenships;
	private Birthday birthday;
	@XStreamImplicit(itemFieldName = "nameAlias")
	private List<NameAlias> nameAliases;

	// attributes
	@Id
	@XStreamAsAttribute
	private String logicalId;
	@XStreamAsAttribute
	private String designationDetails;
	@XStreamAsAttribute
	private String unitedNationId;
	@XStreamAsAttribute
	private String euReferenceNumber;

	public List<String> getRemark() {
		return remark;
	}

	public void setRemark(List<String> remark) {
		this.remark = remark;
	}

	public Regulation getRegulation() {
		return regulation;
	}

	public void setRegulation(Regulation regulation) {
		this.regulation = regulation;
	}

	public List<NameAlias> getNameAliases() {
		return nameAliases;
	}

	public void setNameAliases(List<NameAlias> nameAliases) {
		this.nameAliases = nameAliases;
	}

	public List<Citizenship> getCitizenships() {
		return citizenships;
	}

	public void setCitizenship(List<Citizenship> citizenships) {
		this.citizenships = citizenships;
	}

	public Birthday getBirthday() {
		return birthday;
	}

	public void setBirthday(Birthday birthday) {
		this.birthday = birthday;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public String getDesignationDetails() {
		return designationDetails;
	}

	public void setDesignationDetails(String designationDetails) {
		this.designationDetails = designationDetails;
	}

	public String getUnitedNationId() {
		return unitedNationId;
	}

	public void setUnitedNationId(String unitedNationId) {
		this.unitedNationId = unitedNationId;
	}

	public String getEuReferenceNumber() {
		return euReferenceNumber;
	}

	public void setEuReferenceNumber(String euReferenceNumber) {
		this.euReferenceNumber = euReferenceNumber;
	}

	public String getLogicalId() {
		return logicalId;
	}

	public void setLogicalId(String logicalId) {
		this.logicalId = logicalId;
	}

}
