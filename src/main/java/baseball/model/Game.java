package baseball.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import baseball.constant.Constant;

public abstract class Game<T> {
	
	public boolean valiation(T num) {
		String[] s = String.valueOf(num).split("");
		Set<String> set = new HashSet<String>(Arrays.asList(s));
		if (set.size() == Constant.GAME_NUM_SIZE) {
			return true;
		}
		return false;
	}
	
}
