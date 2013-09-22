package cn.ediary.model;

import java.io.Serializable;

public class User{
	
	private int uid;
	private String password;
	private String username;

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
    	return this.uid+"#"+this.username+"#"+this.password+"#";
    }
}
