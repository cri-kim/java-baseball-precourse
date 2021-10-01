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
	
}
