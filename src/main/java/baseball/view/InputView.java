package baseball.view;

import baseball.constant.Constant;
import baseball.model.Player;
import nextstep.utils.Console;

public class InputView {

	public Player inputNumber() {
		System.out.print("숫자를 입력해주세요 : ");
		return new Player(Console.readLine());
	}
	
	public boolean isCotinue() {
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		String flag = Console.readLine();
		
		if(flag.equals(Constant.GAME_RESTART)) {
			return true;
		}
		return false;
	}
	
}
