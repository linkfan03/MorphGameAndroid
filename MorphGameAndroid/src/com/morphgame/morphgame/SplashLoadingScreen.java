package com.morphgame.morphgame;

import com.morphgame.framework.Game;

import com.morphgame.framework.Graphics;
import com.morphgame.framework.Screen;
import com.morphgame.framework.Graphics.ImageFormat;

public class SplashLoadingScreen extends Screen {
	public SplashLoadingScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        
        game.setScreen(new LoadingScreen(game));

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
