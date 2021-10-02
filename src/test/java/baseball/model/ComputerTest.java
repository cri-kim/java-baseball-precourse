package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ComputerTest {

	@DisplayName("1부터 9까지 서로 다른 수로 이루어진 3자리 체크")
	@CsvSource(value = {"315","152","123"})
	@ParameterizedTest
	void validationTest(String strNum) {
		Computer computer = new Computer();
		assertThat(computer.valiation(Integer.parseInt(strNum)))
		.isTrue();
	}
	
	@DisplayName("숫자 생성")
	@Test
	void createNumber() {
		Computer computer = new Computer();
		assertThat(computer.getNumber())
			.isBetween(100,999);
	}
	
}