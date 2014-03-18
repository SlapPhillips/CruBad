package com.me.crutuu.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.me.crutuu.Input;

public class TitleScreen extends Screen {
    
    @Override
    public void render() {
        Gdx.gl20.glClearColor(0.5f, 0.5f, 0.5f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        spriteBatch.begin();
        
        spriteBatch.end();
    }
    
    public void tick(Input input) {
        if (input.buttons[input.MELEE]) {
            setScreen(new StreetScreen());
        }
    }

}
