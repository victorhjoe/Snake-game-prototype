package br.com.softblue.snake.scene;

import br.com.softblue.snake.graphics.Text;
import br.com.softblue.snake.util.Constants;

public class GameOverText extends Text {

	public GameOverText(int score) {
		super(Constants.GAME_OVER_COLOR, String.format(Constants.GAME_OVER_TEXT, score) , Constants.GAME_OVER_LOCATION);
	}

}
