package com.controller.flightuser.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Document("users")
public class User {
	
	@Id
	private String userid;
	@Field
	private String username;
	@Field
	private  String useremail;
	@Field
	private  String userpass;
	@Field
	private  String userphone;
	
	public User()
	{
		
	}
	
	public User(String userid, String username, String useremail, String userpass, String userphone) {
	
		this.userid = userid;
		this.username = username;
		this.useremail = useremail;
		this.userpass = userpass;
		this.userphone = userphone;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

}
