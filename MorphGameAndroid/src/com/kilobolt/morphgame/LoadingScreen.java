package com.kilobolt.morphgame;

import com.kilobolt.framework.Game;
import com.kilobolt.framework.Graphics;
import com.kilobolt.framework.Screen;
import com.kilobolt.framework.Graphics.ImageFormat;

public class LoadingScreen extends Screen {
	public LoadingScreen(Game game) {
        super(game);
    }


    @Override
    public void update(float deltaTime) {
    	//RGB565 takes up least amount of memory
    	//ARGB4444 when transparency could be needed
        Graphics g = game.getGraphics();
        Assets.menu = g.newImage("menu.png", ImageFormat.RGB565);
        Assets.button = g.newImage("button.jpg", ImageFormat.RGB565);
        Assets.background = g.newImage("backgroundMockUp1.png", ImageFormat.RGB565);
        Assets.square = g.newImage("square.png", ImageFormat.ARGB4444);
        Assets.squareDown = g.newImage("squareDown.png", ImageFormat.ARGB4444);
        Assets.squareBack = g.newImage("squareBack.png", ImageFormat.ARGB4444);
        Assets.squareForward = g.newImage("squareForward.png", ImageFormat.ARGB4444);
        Assets.squareJump = g.newImage("squareJump.png", ImageFormat.ARGB4444);
        
        
        Assets.tiledirt = g.newImage("tiledirt.png", ImageFormat.RGB565);
        Assets.tilegrassTop = g.newImage("tilegrasstop.png", ImageFormat.RGB565);
        Assets.tilegrassMorph = g.newImage("tilegrassbot.png", ImageFormat.RGB565);
        Assets.tilegrassLeft = g.newImage("tilegrassleft.png", ImageFormat.RGB565);
        Assets.tilegrassRight = g.newImage("tilegrassright.png", ImageFormat.RGB565);
		Assets.tileSpike = g.newImage("tileSpike.png", ImageFormat.RGB565);
        

        
        game.setScreen(new MainMenuScreen(game));


    }


    @Override
    public void paint(float deltaTime) {


    }


    @Override
    public void pause() {


    }


    @Override
    public void resume() {


    }


    @Override
    public void dispose() {


    }


    @Override
    public void backButton() {


    }
}
