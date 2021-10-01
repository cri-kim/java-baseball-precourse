package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PlayerTest {

	@DisplayName("사용자 오입력 값에 따른 error 반환")
	@ParameterizedTest
	@CsvSource(value = {"3","avc","1234","221","w2q","@@@"})
	void isError(String strNum) {
		Player player = new Player(strNum);
		assertThat(player.isError()).isEqualTo(false);
	}
}
