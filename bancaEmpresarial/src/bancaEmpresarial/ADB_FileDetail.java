package bancaEmpresarial;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ADB_FileDetails database table.
 * 
 */
@Entity
@Table(name="ADB_FileDetails")
@NamedQuery(name="ADB_FileDetail.findAll", query="SELECT a FROM ADB_FileDetail a")
public class ADB_FileDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ADB_FileDetailPK id;

	@Column(name="AccountDestination")
	private String accountDestination;

	@Column(name="AccountOrigin")
	private String accountOrigin;

	@Column(name="AccountTypeDestination")
	private String accountTypeDestination;

	@Column(name="AccountTypeOrigin")
	private String accountTypeOrigin;

	@Column(name="Ammount")
	private String ammount;

	@Column(name="Autorization")
	private String autorization;

	@Column(name="Beneficiary")
	private String beneficiary;

	@Column(name="BranchDestination")
	private String branchDestination;

	@Column(name="BranchOrigin")
	private String branchOrigin;

	@Column(name="Currency")
	private String currency;

	@Column(name="Date")
	private String date;

	@Column(name="Error")
	private String error;

	@Column(name="FileType")
	private String fileType;

	private String IDFaculty;

	@Column(name="LineType")
	private String lineType;

	@Column(name="NumericReference1")
	private String numericReference1;

	@Column(name="NumericReference2")
	private String numericReference2;

	@Column(name="NumericReference3")
	private String numericReference3;

	@Column(name="Reference1")
	private String reference1;

	@Column(name="Reference2")
	private String reference2;

	@Column(name="Reference3")
	private String reference3;

	@Column(name="Status")
	private String status;

	@Column(name="SubFaculty")
	private String subFaculty;

	@Column(name="Time")
	private String time;

	public ADB_FileDetail() {
	}

	public ADB_FileDetailPK getId() {
		return this.id;
	}

	public void setId(ADB_FileDetailPK id) {
		this.id = id;
	}

	public String getAccountDestination() {
		return this.accountDestination;
	}

	public void setAccountDestination(String accountDestination) {
		this.accountDestination = accountDestination;
	}

	public String getAccountOrigin() {
		return this.accountOrigin;
	}

	public void setAccountOrigin(String accountOrigin) {
		this.accountOrigin = accountOrigin;
	}

	public String getAccountTypeDestination() {
		return this.accountTypeDestination;
	}

	public void setAccountTypeDestination(String accountTypeDestination) {
		this.accountTypeDestination = accountTypeDestination;
	}

	public String getAccountTypeOrigin() {
		return this.accountTypeOrigin;
	}

	public void setAccountTypeOrigin(String accountTypeOrigin) {
		this.accountTypeOrigin = accountTypeOrigin;
	}

	public String getAmmount() {
		return this.ammount;
	}

	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}

	public String getAutorization() {
		return this.autorization;
	}

	public void setAutorization(String autorization) {
		this.autorization = autorization;
	}

	public String getBeneficiary() {
		return this.beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getBranchDestination() {
		return this.branchDestination;
	}

	public void setBranchDestination(String branchDestination) {
		this.branchDestination = branchDestination;
	}

	public String getBranchOrigin() {
		return this.branchOrigin;
	}

	public void setBranchOrigin(String branchOrigin) {
		this.branchOrigin = branchOrigin;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getIDFaculty() {
		return this.IDFaculty;
	}

	public void setIDFaculty(String IDFaculty) {
		this.IDFaculty = IDFaculty;
	}

	public String getLineType() {
		return this.lineType;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	public String getNumericReference1() {
		return this.numericReference1;
	}

	public void setNumericReference1(String numericReference1) {
		this.numericReference1 = numericReference1;
	}

	public String getNumericReference2() {
		return this.numericReference2;
	}

	public void setNumericReference2(String numericReference2) {
		this.numericReference2 = numericReference2;
	}

	public String getNumericReference3() {
		return this.numericReference3;
	}

	public void setNumericReference3(String numericReference3) {
		this.numericReference3 = numericReference3;
	}

	public String getReference1() {
		return this.reference1;
	}

	public void setReference1(String reference1) {
		this.reference1 = reference1;
	}

	public String getReference2() {
		return this.reference2;
	}

	public void setReference2(String reference2) {
		this.reference2 = reference2;
	}

	public String getReference3() {
		return this.reference3;
	}

	public void setReference3(String reference3) {
		this.reference3 = reference3;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubFaculty() {
		return this.subFaculty;
	}

	public void setSubFaculty(String subFaculty) {
		this.subFaculty = subFaculty;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}