package com.techzone.model;

import java.io.Serializable;

public class User implements Serializable{
	
	private int uid;
	private String password;
	private String username;
	
	public User(){
		
	}
	
	public String getPassword() {
		return password;
	}

	public int getUid() {
		return uid;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
    public void setUsername(String username) {
		this.username = username;
	}
   
    @Override
    public String toString(){
    	return this.toString();
    }
    
}
