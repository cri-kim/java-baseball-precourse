package baseball.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Player extends Game<String>{
	
	private List<String> numbers;
	
	private String strNum;
	
	public Player(String strNum){
		this.strNum = strNum;
		setNumbers(strNum);
	}

	public void setNumbers(String number) {
		numbers = new ArrayList<String>(Arrays.asList(number.split("")));
	}
	
	public boolean isError() {
		if(!isNumeric(strNum) || !valiation(strNum)) {
			return true;
		}
		return false;
	}

	private boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public int getMatchNumberCount(int i, String target) {
		if (numbers.get(i).equals(target)) {
			return 1;
		}
		return 0;
	}

	public int getContainNumberCount(int i, String target) {
		if (getMatchNumberCount(i, target) == 0 && numbers.contains(target)) {
			return 1;
		}
		return 0;
	}

}
