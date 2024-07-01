package model;

import java.io.Serializable;

public class Game implements Serializable {
	private int com;
	private int user;
	private String result;
	
	public Game() {}
	
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}
