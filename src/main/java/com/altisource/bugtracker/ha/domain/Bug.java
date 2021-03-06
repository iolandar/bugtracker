package com.altisource.bugtracker.ha.domain;

// Generated Jan 25, 2015 2:41:43 PM by Hibernate Tools 4.0.0

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Bug generated by hbm2java
 */
@Entity
@Table(name = "BUG", uniqueConstraints = @UniqueConstraint(columnNames = "title"))
public class Bug implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bugId;

	@ManyToOne
	@JoinColumn(name = "COMPONENT_ID")
	private Component component;

	@ManyToOne
	@JoinColumn(name = "AFFECTED_VERSION")
	private Version versionByAffectedVersion;

	@ManyToOne
	@JoinColumn(name = "PROJECT_ID")
	private Project project;

	@ManyToOne
	@JoinColumn(name = "FIXED_VERSION")
	private Version versionByFixedVersion;

	@Column(name = "TITLE", unique = true, length = 100)
	private String title;

	@Column(name = "DESCRIPTION", length = 1000)
	private String description;

	@Column(name = "PRIORITY", length = 30)
	private String priority;

	@Column(name = "STATUS", length = 45)
	private String status;

	@Column(name = "RESOLUTION", length = 45)
	private String resolution;

	@Column(name = "ASIGNEE_ID")
	private Integer asigneeId;

	@Column(name = "REPORTER_ID")
	private Integer reporterId;

	public Bug() {}

	public Bug(Component component, Version versionByAffectedVersion,
			Project project, Version versionByFixedVersion, String title,
			String description, String priority, String status,
			String resolution, Integer asigneeId, Integer reporterId) {
		this.component = component;
		this.versionByAffectedVersion = versionByAffectedVersion;
		this.project = project;
		this.versionByFixedVersion = versionByFixedVersion;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.status = status;
		this.resolution = resolution;
		this.asigneeId = asigneeId;
		this.reporterId = reporterId;
	}

	public Long getBugId() {
		return this.bugId;
	}

	public void setBugId(Long bugId) {
		this.bugId = bugId;
	}

	public Component getComponent() {
		return this.component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public Version getVersionByAffectedVersion() {
		return this.versionByAffectedVersion;
	}

	public void setVersionByAffectedVersion(Version versionByAffectedVersion) {
		this.versionByAffectedVersion = versionByAffectedVersion;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Version getVersionByFixedVersion() {
		return this.versionByFixedVersion;
	}

	public void setVersionByFixedVersion(Version versionByFixedVersion) {
		this.versionByFixedVersion = versionByFixedVersion;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResolution() {
		return this.resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public Integer getAsigneeId() {
		return this.asigneeId;
	}

	public void setAsigneeId(Integer asigneeId) {
		this.asigneeId = asigneeId;
	}

	public Integer getReporterId() {
		return this.reporterId;
	}

	public void setReporterId(Integer reporterId) {
		this.reporterId = reporterId;
	}

}
