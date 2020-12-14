package step3;

import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();

        RacingGame game = new RacingGame(inputHandler.getCarNameList(), inputHandler.getRoundCount());
        game.play();
        game.getMatchResult().print();
    }

}

