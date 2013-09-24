package com.techzone.account.bo;

import java.io.Serializable;

public class SysUser implements Serializable {

	private static final long serialVersionUID = -8138447347176260275L;

	private Long id;
	private String username;
	private Boolean enabled;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Boolean getEnabled() {
		return enabled;
	}
	
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
}
