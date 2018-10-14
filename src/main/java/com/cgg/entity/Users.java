package com.cgg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="userd")
public class Users {

	@Id
	@GeneratedValue(generator="abc")
	@SequenceGenerator(name="abc",sequenceName="uid")
	private int uid;
	@Column(unique=true)
	private String username;
	
	private String pass;

	public Users() {
		super();
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", username=" + username + ", pass=" + pass + "]";
	}
	
	
}
