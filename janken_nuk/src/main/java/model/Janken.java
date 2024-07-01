package model;

import java.io.Serializable;

public class Janken implements Serializable {
	private int user;
	private int com;
	private String result;
	
	public Janken() {}
	public Janken(int user, int com) {
		this.user = user;
		this.com = com;
	}
	public int getUser() {
		return user;
	}
	public int getCom() {
		return com;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}
