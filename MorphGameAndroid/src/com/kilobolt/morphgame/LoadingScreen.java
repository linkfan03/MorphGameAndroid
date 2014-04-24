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
        Graphics g = game.getGraphics();
        Assets.menu = g.newImage("menu.png", ImageFormat.RGB565);
        Assets.background = g.newImage("backgroundMockUp1.png", ImageFormat.RGB565);
        Assets.character = g.newImage("character.png", ImageFormat.ARGB4444);
        Assets.characterDown = g.newImage("characterDown.png", ImageFormat.ARGB4444);
        Assets.characterJump = g.newImage("characterJump.png", ImageFormat.ARGB4444);
        

        
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
