package com.learn.jpa.JPALearn;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int uid;
	
	private String uname;
	private String tecg;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getTecg() {
		return tecg;
	}
	public void setTecg(String tech) {
		this.tecg = tech;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", tecg=" + tecg + "]";
	}
	
	
	

}
