package com.morphgame.morphgame;

import com.morphgame.framework.Image;

import android.graphics.Rect;

//The tile class provides the structure and methods of instantiation for tile objects, which are spawned to give 
//the character platforms to move on
public class Tile {

	private int tileX, tileY, speedX, type;
	public Image tileImage;

	private MainCharacter maincharacter = GameScreen.getMainCharacter();
	private Background bg = GameScreen.getBg1();

	private Rect r;

	public Tile(int x, int y, int typeInt) {
		tileX = x * 40;
		tileY = y * 40;

		type = typeInt;

		r = new Rect();

		if (type == 5) {
			tileImage = Assets.tiledirt;
		} else if (type == 8) {
			tileImage = Assets.tilegrassTop;
		} else if (type == 4) {
			tileImage = Assets.tilegrassLeft;

		} else if (type == 6) {
			tileImage = Assets.tilegrassRight;

		} else if (type == 2) {
			tileImage = Assets.tilegrassMorph;
		} else if (type == 9) {
			tileImage = Assets.tileSpike;
		} else {

			type = 0;
		}

	}

	// The update method for tiles, it paints them and checks for collisions as
	// the game is updated
	public void update() {
		speedX = bg.getSpeedX() * 5;
		tileX += speedX;
		r.set(tileX, tileY, tileX+40, tileY+40);

		if (Rect.intersects(r, MainCharacter.yellowRed) && type != 0) {
			checkVerticalCollision(MainCharacter.rect, MainCharacter.rect2);
			checkSideCollision(MainCharacter.rect3, MainCharacter.rect4,
					MainCharacter.footleft, MainCharacter.footright);
			checkSpikesCollision(MainCharacter.rect2);
		}

	}
	
	public int getTileType(){
		return type;
	}

	public int getTileX() {
		return tileX;
	}

	public void setTileX(int tileX) {
		this.tileX = tileX;
	}

	public int getTileY() {
		return tileY;
	}

	public void setTileY(int tileY) {
		this.tileY = tileY;
	}

	public Image getTileImage() {
		return tileImage;
	}

	public void setTileImage(Image tileImage) {
		this.tileImage = tileImage;
	}
	
	//This method checks to see if the character is colliding with a spikes tile, which results in death
	public void checkSpikesCollision(Rect rbot){
		if(Rect.intersects(rbot, r) && type == 9){
			maincharacter.setTouchingSpikes(true);
		}
	}
	// This method checks to see if there is a vertical collision between the
	// character and a tile
	public void checkVerticalCollision(Rect rtop, Rect rbot) {
		if (Rect.intersects(rtop, r)) {

		}

		if (Rect.intersects(rbot, r) && type == 8) {
			maincharacter.setJumped(false);
			maincharacter.setSpeedY(0);
			maincharacter.setCenterY(tileY - 63);
		}
	}

	// This method checks to see if there is a sideways collision between the
	// character and a tile,
	// you see left and right "feet" even though the character has no tangible
	// feet in order to allow
	// the character to be standing on a ledge with just a bit of his body
	// resting on a tile
	public void checkSideCollision(Rect rleft, Rect rright,
			Rect leftfoot, Rect rightfoot) {
		if (type != 5 && type != 2 && type != 0) {
			if (Rect.intersects(r, rleft)) {
				maincharacter.setCenterX(tileX + 102);

				maincharacter.setSpeedX(0);

			} else if (Rect.intersects(leftfoot, r)) {
				maincharacter.setCenterX(tileX + 85);
				maincharacter.setSpeedX(0);
			}

			if (Rect.intersects(rright, r)) {
				maincharacter.setCenterX(tileX - 62);

				maincharacter.setSpeedX(0);
			}

			else if (Rect.intersects(rightfoot, r)) {
				maincharacter.setCenterX(tileX - 45);
				maincharacter.setSpeedX(0);
			}
		}
	}
}
