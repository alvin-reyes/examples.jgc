package com.macq.ci.tools.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="uc_request_output")
public class UcRequestOutput extends UcOwner  implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(targetEntity=UcRequest.class,cascade=CascadeType.ALL)
	private UcRequest ucRequest;
	
	@Column(name="filename")
	private String fileName;
	
	public UcRequestOutput() {}
	
	public UcRequestOutput(int id, UcRequest ucRequest, String fileName) {
		super();
		this.id = id;
		this.ucRequest = ucRequest;
		this.fileName = fileName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UcRequest getUcRequest() {
		return ucRequest;
	}
	public void setUcRequest(UcRequest ucRequest) {
		this.ucRequest = ucRequest;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
	

	
}
