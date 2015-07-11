package com.macq.ci.tools.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="uc_request")
public class UcRequest extends UcOwner implements Serializable {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="email",length=100)
	private String email;
	
	@Column(name="status",length=25)
	private String status;
	@Column(name="svn_url_1",length=500)
	private String svnUrl1;
	@Column(name="svn_url_2",length=500)
	private String svnUrl2;
	
	@Column(name="svn_url_1_name",length=500)
	private String svnUrl1Name;
	@Column(name="svn_url_2_name",length=500)
	private String svnUrl2Name;
	
	public String getSvnUrl1Name() {
		return svnUrl1Name;
	}
	public void setSvnUrl1Name(String svnUrl1Name) {
		this.svnUrl1Name = svnUrl1Name;
	}
	public String getSvnUrl2Name() {
		return svnUrl2Name;
	}
	public void setSvnUrl2Name(String svnUrl2Name) {
		this.svnUrl2Name = svnUrl2Name;
	}
	public String getSvnUrl1() {
		return svnUrl1;
	}
	public void setSvnUrl1(String svnUrl1) {
		this.svnUrl1 = svnUrl1;
	}
	public String getSvnUrl2() {
		return svnUrl2;
	}
	public void setSvnUrl2(String svnUrl2) {
		this.svnUrl2 = svnUrl2;
	}

	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="id",cascade=CascadeType.ALL)
	private List<UcRequestOutput> ucRequestOutput;

	public UcRequest() {
		// TODO Auto-generated constructor stub
	}
	public UcRequest(Long id, String email, String status) {
		this.id = id;
		this.email = email;
		this.status = status;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<UcRequestOutput> getUcRequestOutput() {
		return ucRequestOutput;
	}
	public void setUcRequestOutput(List<UcRequestOutput> ucRequestOutput) {
		this.ucRequestOutput = ucRequestOutput;
	}
	
}
