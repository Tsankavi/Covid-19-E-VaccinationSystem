package lk.ac.pdn.scs.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="log_id", nullable=false, unique=true)
	private int log_id;
	
	@Column(name="log_username", nullable=false)
	private String log_username;
	

	@Column(name="log_password", nullable=false)
	private String log_password;
	
	@Enumerated(EnumType.ORDINAL)
    private Role log_role;

	public Account(String log_username, String log_password, Role role) {
		super();
		this.log_username = log_username;
		this.log_password = log_password;
		this.log_role = role;
	}
	


	public int getLog_id() {
		return log_id;
	}

	public void setLog_id(int log_id) {
		this.log_id = log_id;
	}

	public String getLog_username() {
		return log_username;
	}

	public void setLog_username(String log_username) {
		this.log_username = log_username;
	}

	public String getLog_password() {
		return log_password;
	}

	public void setLog_password(String log_password) {
		this.log_password = log_password;
	}

	public Role getRole() {
		return log_role;
	}

	public void setRole(Role role) {
		this.log_role = role;
	}
	
	


}
