package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PlayerTest {

	private String gameNumber;
	
	@BeforeEach
	void setup() {
		gameNumber = "182";
	}
	
	@DisplayName("사용자 오입력 값에 따른 error 반환")
	@ParameterizedTest
	@CsvSource(value = {"3","avc","1234","221","w2q","@@@"})
	void isError(String strNum) {
		Player player = new Player(strNum);
		assertThat(player.isError())
		.isTrue();
	}
	
	@DisplayName("strike 값 반환")
	@ParameterizedTest
	@CsvSource(value = {"356","123","456","789"})
	void getMatchNumberCount(String strNum) {
		Player player = new Player(strNum);
		for(int i=0;i<strNum.length();i++) {
			assertThat(player.getMatchNumberCount(i, gameNumber))
			.isBetween(0, 1);
		}
		
	}
	@DisplayName("ball 값 반환")
	@ParameterizedTest
	@CsvSource(value = {"356","123","456","789"})
	void getContainNumberCount(String strNum) {
		Player player = new Player(strNum);
		for(int i=0;i<strNum.length();i++) {
			assertThat(player.getContainNumberCount(i, gameNumber))
			.isBetween(0, 1);
		}
	}
}
