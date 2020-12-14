package step3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class CarMoverTest {

    private static final String SEPARATOR = ",";
    private static final String DUMMY_CAR_NAME = "Dummy";


    @ParameterizedTest
    @ValueSource(strings = {
            "0" + SEPARATOR + Car.NOT_MOVED,
            "2" + SEPARATOR + Car.NOT_MOVED,
            "3" + SEPARATOR + Car.NOT_MOVED,
            "4" + SEPARATOR + Car.WAY,
            "9" + SEPARATOR + Car.WAY
    })
    public void 숫자에따라_차의_움직이는_여부_확인(String input) {
        int number = Integer.parseInt(input.split(SEPARATOR)[0]);
        String expected = input.split(SEPARATOR)[1];
        Car car = new Car("Dummy");
        CarMover carMover = new CarMover();
        carMover.moveOrNot(car, number);
        assertThat(car.getWayResult()).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "-1",
            "10"
    })
    public void 무작위_숫자가_잘못된_경우(String input) {
        int number = Integer.parseInt(input);
        Car car = new Car(DUMMY_CAR_NAME);
        CarMover carMover = new CarMover();
        assertThatThrownBy(() -> carMover.moveOrNot(car, number)).isInstanceOf(IllegalArgumentException.class);
    }

}


