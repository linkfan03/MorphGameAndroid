package com.kilobolt.morphgame;

import android.graphics.Rect;

public class MainCharacter {

	// Constants are Here
	final int MOVESPEED = 5;
	final int GROUND = 382;

	private int centerX = 100;
	private int centerY = GROUND;
	private boolean jumped = false;
	private boolean ducked = false;
	private boolean movingLeft = false;
	private boolean movingRight = false;
	private boolean touchingSpikes = false;

	public static Rect rect = new Rect(0, 0, 0, 0);
	public static Rect rect2 = new Rect(0, 0, 0, 0);
	public static Rect rect3 = new Rect(0, 0, 0, 0);
	public static Rect rect4 = new Rect(0, 0, 0, 0);
	public static Rect yellowRed = new Rect(0, 0, 0, 0);
	public static Rect footleft = new Rect(0, 0, 0, 0);
	public static Rect footright = new Rect(0, 0, 0, 0);

	private static Background bg1 = GameScreen.getBg1();
	private static Background bg2 = GameScreen.getBg2();

	private int jumpSpeed = -15;
	private int speedX = 0;
	private int speedY = 0;

	public void update() {
		// Moves Character or Scrolls Background accordingly.

		if (speedX < 0) {
			centerX += speedX;
		}
		if (speedX == 0 || speedX < 0) {
			bg1.setSpeedX(0);
			bg2.setSpeedX(0);

		}
		if (centerX <= 200 && speedX > 0) {
			centerX += speedX;
		}
		if (speedX > 0 && centerX > 200) {
			bg1.setSpeedX(-MOVESPEED / 5);
			bg2.setSpeedX(-MOVESPEED / 5);
		}

		// Updates Y Position
		centerY += speedY;

		// Handles Jumping

		speedY += 1;

		if (speedY > 3) {
			jumped = true;
		}

		// Prevents going beyond X coordinate of 0
		if (centerX + speedX <= 60) {
			centerX = 61;
		}
		rect.set(centerX - 34, centerY - 63, 68, 63);
		rect2.set(rect.left, rect.top + 63, 68, 63);
		rect3.set(rect.left - 26, rect.top + 32, 26, 20);
		rect4.set(rect.left + 68, rect.top + 32, 26, 20);
		yellowRed.set(centerX - 110, centerY - 110, 180, 180);
		footleft.set(centerX - 50, centerY + 20, 50, 15);
		footright.set(centerX, centerY + 20, 50, 15);
	}

	public boolean isDucked() {
		return ducked;
	}

	public void setDucked(boolean ducked) {
		this.ducked = ducked;
	}

	public void moveRight() {
		if (ducked == false) {
			speedX = MOVESPEED;
		}
	}

	public void moveLeft() {
		if (ducked == false) {
			speedX = -MOVESPEED;
		}
	}

	public void stopRight() {
		setMovingRight(false);
		stop();
	}

	public void stopLeft() {
		setMovingLeft(false);
		stop();
	}

	private void stop() {
		if (isMovingRight() == false && isMovingLeft() == false) {
			speedX = 0;
		}

		if (isMovingRight() == false && isMovingLeft() == true) {
			moveLeft();
		}

		if (isMovingRight() == true && isMovingLeft() == false) {
			moveRight();
		}

	}

	public void jump() {
		if (jumped == false) {
			speedY = jumpSpeed;
			jumped = true;
		}

	}

	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public boolean isJumped() {
		return jumped;
	}

	public int getSpeedX() {
		return speedX;
	}

	public int getSpeedY() {
		return speedY;
	}
	
	public boolean getTouchingSpikes(){
		return touchingSpikes;
	}
	
	public void setTouchingSpikes(boolean touchingSpikes){
		this.touchingSpikes = touchingSpikes;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public void setJumped(boolean jumped) {
		this.jumped = jumped;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}

	public boolean isMovingRight() {
		return movingRight;
	}

	public void setMovingRight(boolean movingRight) {
		this.movingRight = movingRight;
	}

	public boolean isMovingLeft() {
		return movingLeft;
	}

	public void setMovingLeft(boolean movingLeft) {
		this.movingLeft = movingLeft;
	}

	public int getJumpSpeed() {
		return jumpSpeed;
	}

	public void setJumpSpeed(int jUMPSPEED) {
		jumpSpeed = jUMPSPEED;
	}

}
