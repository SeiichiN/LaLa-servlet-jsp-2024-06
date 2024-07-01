package model;

public class SetResultLogic {
	public void execute(Game game) {
		if (game.getCom() == game.getUser()) {
			game.setResult("正解です");
		} else if (game.getCom() < game.getUser()) {
			game.setResult("大きすぎます");
		} else {
			game.setResult("小さすぎます");
		}
	}
}
