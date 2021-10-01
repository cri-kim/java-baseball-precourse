package baseball.view;

import baseball.constant.Constant;
import baseball.model.Computer;
import baseball.model.Player;

public class OutputView {

	public void printResult(Computer computer, Player player) {
		if (player.isError()) {
			printError();
			return;
		}
		if (computer.isNothing(player)) {
			System.out.printf("낫싱");
			return;
		}
		printScore(computer, player);
	}

	private void printScore(Computer computer, Player player) {
		if (computer.hasStrike(player)) {
			System.out.printf("%d 스트라이크 ", computer.getStrikeCount(player));
		}
		if (computer.hasBall(player)) {
			System.out.printf("%d 볼", computer.getBallCount(player));
		}
		System.out.println();
	}

	public void printFin() {
		System.out.println(Constant.GAME_NUM_SIZE + "개의 숫자를 모두 맞히셨습니다! 게임 끝");
	}

	public void printError() {
		System.out.println("[ERROR]");
	}
}
