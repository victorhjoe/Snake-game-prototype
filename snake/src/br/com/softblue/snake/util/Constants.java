package br.com.softblue.snake.util;

import java.awt.Color;
import java.awt.Point;

public class Constants {
	
	public static final int WINDOW_WIDTH = 500;
	public static final int WINDOW_HEIGHT = 500;
	public static final String WINDOW_TITLE = "Snake Game!";
	public static final Color SNAKE_COLOR = Color.WHITE;
	public static final Color BACKGROUND_COLOR = Color.BLACK;
	public static final int SNAKE_START_X = 150;
	public static final int SNAKE_START_Y = 150;
	public static final int SNAKE_ELONGATE_PIECES = 5;
	public static final int SNAKE_PIECE_SIZE = 6;
	public static final int SNAKE_INICIAL_SIZE = 20;
	public static final int FOOD_SIZE = 5;
	public static final String GAME_OVER_TEXT = "GAME OVER %d PONTO(S)";
	public static final Color GAME_OVER_COLOR = Color.RED;
	public static final Point GAME_OVER_LOCATION = 	new Point(WINDOW_WIDTH / 2 - 90, WINDOW_HEIGHT / 2);
	public static final int SLEEP_TIME = 30;
}
