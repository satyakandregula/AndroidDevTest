package com.brentaureli.mariobros;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.brentaureli.mariobros.Screen.PlayScreen;

public class MarioBros extends Game {
	public SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen (new PlayScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
}
