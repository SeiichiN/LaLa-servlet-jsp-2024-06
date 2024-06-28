package model;

public class JudgeLogic {
	
	public void execute(Janken j) {
		String result = null;
		if (j.getCom() == j.getUser()) {
			j.setResult("引き分け");
		} else if ((j.getUser() + 1) % 3 == j.getCom()) {
			j.setResult("あなたの勝ち");
		} else {
			j.setResult("わたしの勝ち");
		}
	}

}
