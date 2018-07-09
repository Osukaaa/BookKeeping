package dto;

//ユーザクラス
public class User {
	private String userid;
	private String userpass;
	private String username;

	public User(String userid, String userpass, String username) {
		this.userid = userid;
		this.userpass = userpass;
		this.username = username;
	}

	public User(){

	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
