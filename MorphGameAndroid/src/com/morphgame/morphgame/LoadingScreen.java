package com.morphgame.morphgame;

import com.morphgame.framework.Game;
import com.morphgame.framework.Graphics;
import com.morphgame.framework.Screen;
import com.morphgame.framework.Graphics.ImageFormat;

public class LoadingScreen extends Screen {
	public LoadingScreen(Game game) {
        super(game);
    }


    @Override
    public void update(float deltaTime) {
    	//RGB565 takes up least amount of memory
    	//ARGB4444 when transparency could be needed
    	
    	//Load the necessary assets
        Graphics g = game.getGraphics();
        Assets.menu = g.newImage("menu.png", ImageFormat.RGB565);
        Assets.button = g.newImage("button.jpg", ImageFormat.RGB565);
        Assets.buttonMorph = g.newImage("buttonMorph.jpg", ImageFormat.RGB565);
        Assets.background = g.newImage("backgroundMockUp1.png", ImageFormat.RGB565);
        Assets.square = g.newImage("square.png", ImageFormat.ARGB4444);
        Assets.down = g.newImage("squareDown.png", ImageFormat.ARGB4444);
        Assets.squareBack = g.newImage("squareBack.png", ImageFormat.ARGB4444);
        Assets.squareForward = g.newImage("squareForward.png", ImageFormat.ARGB4444);
        Assets.squareJump = g.newImage("squareJump.png", ImageFormat.ARGB4444);
        
        Assets.circle = g.newImage("circle.png", ImageFormat.ARGB4444);
        Assets.circleBack = g.newImage("circleBack.png", ImageFormat.ARGB4444);
        Assets.circleForward = g.newImage("circleForward.png", ImageFormat.ARGB4444);
        Assets.circleJump = g.newImage("circleJump.png", ImageFormat.ARGB4444);
        
        Assets.balloon = g.newImage("balloon.png", ImageFormat.ARGB4444);
        Assets.balloonBack = g.newImage("balloonBack.png", ImageFormat.ARGB4444);
        Assets.balloonForward = g.newImage("balloonForward.png", ImageFormat.ARGB4444);
       
        
        
        Assets.tiledirt = g.newImage("tiledirt.png", ImageFormat.RGB565);
        Assets.tilegrassTop = g.newImage("tilegrasstop.png", ImageFormat.RGB565);
        Assets.tilegrassMorph = g.newImage("tilegrassbot.png", ImageFormat.RGB565);
        Assets.tilegrassLeft = g.newImage("tilegrassleft.png", ImageFormat.RGB565);
        Assets.tilegrassRight = g.newImage("tilegrassright.png", ImageFormat.RGB565);
		Assets.tileSpike = g.newImage("tileSpike.png", ImageFormat.RGB565);
        

        //Show the menu screen
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
