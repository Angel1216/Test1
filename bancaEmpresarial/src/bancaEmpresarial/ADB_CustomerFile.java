package bancaEmpresarial;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ADB_CustomerFiles database table.
 * 
 */
@Entity
@Table(name="ADB_CustomerFiles")
@NamedQuery(name="ADB_CustomerFile.findAll", query="SELECT a FROM ADB_CustomerFile a")
public class ADB_CustomerFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ADB_CustomerFilePK id;

	@Column(name="Account")
	private String account;

	@Column(name="AppliedImport")
	private float appliedImport;

	@Column(name="AppliedMovements")
	private int appliedMovements;

	@Column(name="Autorization")
	private String autorization;

	@Column(name="Branch")
	private String branch;

	@Column(name="ContainsErrors")
	private byte containsErrors;

	@Column(name="Currency")
	private String currency;

	@Column(name="Date")
	private String date;

	@Column(name="Error")
	private String error;

	@Column(name="FileType")
	private String fileType;

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

	@Column(name="RejectedImport")
	private float rejectedImport;

	@Column(name="RejectedMovements")
	private int rejectedMovements;

	@Column(name="Status")
	private String status;

	@Column(name="TotalImport")
	private float totalImport;

	@Column(name="TotalMovements")
	private int totalMovements;

	@Column(name="TypeTransfer")
	private String typeTransfer;

	public ADB_CustomerFile() {
	}

	public ADB_CustomerFilePK getId() {
		return this.id;
	}

	public void setId(ADB_CustomerFilePK id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public float getAppliedImport() {
		return this.appliedImport;
	}

	public void setAppliedImport(float appliedImport) {
		this.appliedImport = appliedImport;
	}

	public int getAppliedMovements() {
		return this.appliedMovements;
	}

	public void setAppliedMovements(int appliedMovements) {
		this.appliedMovements = appliedMovements;
	}

	public String getAutorization() {
		return this.autorization;
	}

	public void setAutorization(String autorization) {
		this.autorization = autorization;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public byte getContainsErrors() {
		return this.containsErrors;
	}

	public void setContainsErrors(byte containsErrors) {
		this.containsErrors = containsErrors;
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

	public float getRejectedImport() {
		return this.rejectedImport;
	}

	public void setRejectedImport(float rejectedImport) {
		this.rejectedImport = rejectedImport;
	}

	public int getRejectedMovements() {
		return this.rejectedMovements;
	}

	public void setRejectedMovements(int rejectedMovements) {
		this.rejectedMovements = rejectedMovements;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getTotalImport() {
		return this.totalImport;
	}

	public void setTotalImport(float totalImport) {
		this.totalImport = totalImport;
	}

	public int getTotalMovements() {
		return this.totalMovements;
	}

	public void setTotalMovements(int totalMovements) {
		this.totalMovements = totalMovements;
	}

	public String getTypeTransfer() {
		return this.typeTransfer;
	}

	public void setTypeTransfer(String typeTransfer) {
		this.typeTransfer = typeTransfer;
	}

}