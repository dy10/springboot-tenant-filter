package com.example.filter.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document extends MyBase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long tenant;
	
	private Long subTenant;
	
	private String documentName;
	
	private String documentLocation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTenant() {
		return tenant;
	}

	public void setTenant(Long tenant) {
		this.tenant = tenant;
	}

	public Long getSubTenant() {
		return subTenant;
	}

	public void setSubTenant(Long subTenant) {
		this.subTenant = subTenant;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentLocation() {
		return documentLocation;
	}

	public void setDocumentLocation(String documentLocation) {
		this.documentLocation = documentLocation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documentLocation == null) ? 0 : documentLocation.hashCode());
		result = prime * result + ((documentName == null) ? 0 : documentName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((subTenant == null) ? 0 : subTenant.hashCode());
		result = prime * result + ((tenant == null) ? 0 : tenant.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Document other = (Document) obj;
		if (documentLocation == null) {
			if (other.documentLocation != null)
				return false;
		} else if (!documentLocation.equals(other.documentLocation))
			return false;
		if (documentName == null) {
			if (other.documentName != null)
				return false;
		} else if (!documentName.equals(other.documentName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (subTenant == null) {
			if (other.subTenant != null)
				return false;
		} else if (!subTenant.equals(other.subTenant))
			return false;
		if (tenant == null) {
			if (other.tenant != null)
				return false;
		} else if (!tenant.equals(other.tenant))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", tenant=" + tenant + ", subTenant=" + subTenant + ", documentName="
				+ documentName + ", documentLocation=" + documentLocation + "]";
	}
	
	
	
}
