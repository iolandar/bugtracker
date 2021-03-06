package com.altisource.bugtracker.ha.domain;

// Generated Jan 25, 2015 2:41:43 PM by Hibernate Tools 4.0.0

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ProjectComp generated by hbm2java
 */
@Entity
@Table(name = "PROJECT_COMP")
public class ProjectComp implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "COMPONENT_ID", length = 45)
	private String componentId;

	public ProjectComp() {}

	public ProjectComp(Integer projectId, String componentId) {
		this.componentId = componentId;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComponentId() {
		return this.componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

}
