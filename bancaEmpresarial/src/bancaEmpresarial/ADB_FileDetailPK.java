package bancaEmpresarial;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ADB_FileDetails database table.
 * 
 */
@Embeddable
public class ADB_FileDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Client")
	private String client;

	@Column(name="FileName")
	private String fileName;

	@Column(name="NumberRegistry")
	private int numberRegistry;

	public ADB_FileDetailPK() {
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
	public int getNumberRegistry() {
		return this.numberRegistry;
	}
	public void setNumberRegistry(int numberRegistry) {
		this.numberRegistry = numberRegistry;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ADB_FileDetailPK)) {
			return false;
		}
		ADB_FileDetailPK castOther = (ADB_FileDetailPK)other;
		return 
			this.client.equals(castOther.client)
			&& this.fileName.equals(castOther.fileName)
			&& (this.numberRegistry == castOther.numberRegistry);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.client.hashCode();
		hash = hash * prime + this.fileName.hashCode();
		hash = hash * prime + this.numberRegistry;
		
		return hash;
	}
}