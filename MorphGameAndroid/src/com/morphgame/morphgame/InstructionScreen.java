package com.morphgame.morphgame;
import java.util.List;

import com.morphgame.framework.Game;
import com.morphgame.framework.Graphics;
import com.morphgame.framework.Screen;
import com.morphgame.framework.Input.TouchEvent;

public class InstructionScreen extends Screen {
	
	public InstructionScreen(Game game){
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		Graphics g = game.getGraphics();
        List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
        
        int len = touchEvents.size();
        for (int i = 0; i < len; i++) {
            TouchEvent event = touchEvents.get(i);
            if (event.type == TouchEvent.TOUCH_UP) {
                if (inBounds(event, 50, 350, 250, 450)) {
                    //Back to menu
                    game.setScreen(new MainMenuScreen(game));               
            	}
            }
        }
	}

	@Override
	public void paint(float deltaTime) {
		   Graphics g = game.getGraphics();
	        g.drawImage(Assets.InstructionMenu, 0, 0);
	    }

	
	private boolean inBounds(TouchEvent event, int x, int y, int width,
            int height) {
        if (event.x > x && event.x < x + width - 1 && event.y > y
                && event.y < y + height - 1)
            return true;
        else
            return false;
    }
	
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void backButton() {
		// TODO Auto-generated method stub
		
	}
}
