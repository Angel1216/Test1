package bancaEmpresarial;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ADB_FileDefinition database table.
 * 
 */
@Entity
@NamedQuery(name="ADB_FileDefinition.findAll", query="SELECT a FROM ADB_FileDefinition a")
public class ADB_FileDefinition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IDFileType;

	@Column(name="ClientSide")
	private byte clientSide;

	@Column(name="FileLimit")
	private int fileLimit;

	@Column(name="FileType")
	private String fileType;

	@Column(name="ServerSide")
	private byte serverSide;

	//bi-directional many-to-one association to ADB_FileField
	@OneToMany(mappedBy="adbFileDefinition")
	private List<ADB_FileField> adbFileFields;

	//bi-directional many-to-one association to ADB_FileLine
	@OneToMany(mappedBy="adbFileDefinition")
	private List<ADB_FileLine> adbFileLines;

	public ADB_FileDefinition() {
	}

	public int getIDFileType() {
		return this.IDFileType;
	}

	public void setIDFileType(int IDFileType) {
		this.IDFileType = IDFileType;
	}

	public byte getClientSide() {
		return this.clientSide;
	}

	public void setClientSide(byte clientSide) {
		this.clientSide = clientSide;
	}

	public int getFileLimit() {
		return this.fileLimit;
	}

	public void setFileLimit(int fileLimit) {
		this.fileLimit = fileLimit;
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte getServerSide() {
		return this.serverSide;
	}

	public void setServerSide(byte serverSide) {
		this.serverSide = serverSide;
	}

	public List<ADB_FileField> getAdbFileFields() {
		return this.adbFileFields;
	}

	public void setAdbFileFields(List<ADB_FileField> adbFileFields) {
		this.adbFileFields = adbFileFields;
	}

	public ADB_FileField addAdbFileField(ADB_FileField adbFileField) {
		getAdbFileFields().add(adbFileField);
		adbFileField.setAdbFileDefinition(this);

		return adbFileField;
	}

	public ADB_FileField removeAdbFileField(ADB_FileField adbFileField) {
		getAdbFileFields().remove(adbFileField);
		adbFileField.setAdbFileDefinition(null);

		return adbFileField;
	}

	public List<ADB_FileLine> getAdbFileLines() {
		return this.adbFileLines;
	}

	public void setAdbFileLines(List<ADB_FileLine> adbFileLines) {
		this.adbFileLines = adbFileLines;
	}

	public ADB_FileLine addAdbFileLine(ADB_FileLine adbFileLine) {
		getAdbFileLines().add(adbFileLine);
		adbFileLine.setAdbFileDefinition(this);

		return adbFileLine;
	}

	public ADB_FileLine removeAdbFileLine(ADB_FileLine adbFileLine) {
		getAdbFileLines().remove(adbFileLine);
		adbFileLine.setAdbFileDefinition(null);

		return adbFileLine;
	}

}