package application;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import engine.scene.GameScene;

public class Main {
    public final static Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    public final static int SCREEN_WIDTH = (int)SCREEN_SIZE.getWidth();
    public final static int SCREEN_HEIGHT = (int)SCREEN_SIZE.getHeight();
    public final static Dimension WINDOW_SIZE = new Dimension(800 + 15, 800 + 40);
    public final static int WINDOW_WIDTH = (int)WINDOW_SIZE.getWidth();
    public final static int WINDOW_HEIGHT = (int)WINDOW_SIZE.getHeight();

    public final static String FONT_NAME = "Comic sans MS";
    public final static int FONT_TYPE = Font.BOLD;
    public final static int BOT_COUNT = 150;
    public final static int FOOD_COUNT = 2000;
    public final static int SPEED = 5;
    public static int width = 1600;
    public static int height = 900;

    public static void main(String[] args) {
        GameScene gameScene = new GameScene(width, height);
        new GameView(WINDOW_WIDTH, WINDOW_HEIGHT, gameScene);
    }
}