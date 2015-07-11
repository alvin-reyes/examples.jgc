package com.macq.ci.tools.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="uc_request_log")
public class UcRequestLog extends UcOwner  implements Serializable {

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(targetEntity=UcRequest.class)
	private UcRequest ucRequest;
	
	@Column(name="status")
	private String status;

	@Column(name="log")
	private String log;

	public UcRequestLog() {
		// TODO Auto-generated constructor stub
	}
	public UcRequestLog(Long id, UcRequest ucRequest, String status, String log) {
		super();
		this.id = id;
		this.ucRequest = ucRequest;
		this.status = status;
		this.log = log;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UcRequest getUcRequest() {
		return ucRequest;
	}

	public void setUcRequest(UcRequest ucRequest) {
		this.ucRequest = ucRequest;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}
	
}
