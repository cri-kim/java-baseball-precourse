package baseball.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import baseball.constant.Constant;
import nextstep.utils.Randoms;

public class Computer extends Game<Integer>{

	private List<String> numbers;
	
	public Computer() {
		createNumber();
	}
	
	private void createNumber() {
		int n = 0;
		do{
			n = Randoms.pickNumberInRange(100, 999);
		}
		while(!valiation(n));
		setNumbers(n);
	}
	
	private void setNumbers(int n) {
		numbers = new ArrayList<String>(Arrays.asList(String.valueOf(n).split("")));
	}
	
	public boolean hasStrike(Player player) {
		return getStrikeCount(player) > 0;
	}
	
	public boolean hasBall(Player player) {
		return getBallCount(player) > 0;
	}
	
	public boolean isNothing(Player player) {
		return getStrikeCount(player) == 0 && getBallCount(player)== 0;
	}
	
	public int getStrikeCount(Player player) {
		int cnt = 0;
		for(int i=0;i<Constant.GAME_NUM_SIZE ; i++) {
			cnt += player.getMatchNumberCount(i, numbers.get(i));
		}
		return cnt;
	}
	
	public int getBallCount(Player player) {
		int cnt = 0;
		for(int i=0;i<Constant.GAME_NUM_SIZE;i++) {
			cnt += player.getContainNumberCount(i, numbers.get(i));
		}
		return cnt;
	}
}
