package springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="user")
public class User {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	//@Column(name="UserEmail")
	private String UserEmail;
//	@Column(name="UserName")
	private String UserName;
	//@Column(name="UserPassword")
	private String UserPassword;
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	@Override
	public String toString() {
		return "User [UserEmail=" + UserEmail + ", UserName=" + UserName + ", UserPassword=" + UserPassword + "]";
	}
	
	
	
	
	
	
}
