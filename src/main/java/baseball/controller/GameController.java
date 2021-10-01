package baseball.controller;

import baseball.model.Computer;
import baseball.model.Player;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

	private InputView inputView;
	private OutputView outputView;
	
	public void run() {
		inputView = new InputView();
		outputView = new OutputView();
		
		do {
			playGame();
		}
		while(inputView.isCotinue());
	}
	
	public void playGame() {
		Computer game = new Computer();
		Player player;
		do {

			player = inputView.inputNumber();
			outputView.printResult(game, player);
		}
		while(!game.isFinish(player));
		outputView.printFin();
	}
}
