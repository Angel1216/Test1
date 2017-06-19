package bancaEmpresarial;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ADB_CustomerFiles database table.
 * 
 */
@Embeddable
public class ADB_CustomerFilePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Client")
	private String client;

	@Column(name="FileName")
	private String fileName;

	@Column(name="Identificator")
	private String identificator;

	public ADB_CustomerFilePK() {
	}
	public String getClient() {
		return this.client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getIdentificator() {
		return this.identificator;
	}
	public void setIdentificator(String identificator) {
		this.identificator = identificator;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ADB_CustomerFilePK)) {
			return false;
		}
		ADB_CustomerFilePK castOther = (ADB_CustomerFilePK)other;
		return 
			this.client.equals(castOther.client)
			&& this.fileName.equals(castOther.fileName)
			&& this.identificator.equals(castOther.identificator);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.client.hashCode();
		hash = hash * prime + this.fileName.hashCode();
		hash = hash * prime + this.identificator.hashCode();
		
		return hash;
	}
}