package com.me.crutuu;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.me.crutuu.screen.Screen;
import com.me.crutuu.screen.TitleScreen;

public class CruTuu implements ApplicationListener {
    
    public static final String VERSION = "super alpha 0.01";
    public static final String LOG = "helloworld";
    public static final boolean DEBUG = true;
    FPSLogger log;
    private boolean running;
    private Screen screen;
    private float delta;
    private final Input input = new Input();
    
    @Override
    public void create() {      
        log = new FPSLogger();
        running = true;
        Gdx.input.setInputProcessor(input);
        setScreen(new TitleScreen());
    }
    
    public void setScreen(Screen newScreen) {
        if (screen != null) screen.removed();
        screen = newScreen;
        if (screen != null) screen.init(this);
    }

    @Override
    public void dispose() {
        
    }

    @Override
    public void render() {      
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        delta = Gdx.graphics.getDeltaTime();
        while (delta > 1.0f / 60.0f) {
            screen.tick(input);
            input.tick();
            delta -= 1.0f / 60.0f;
        }
        screen.render();

        //log.log();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
        running = false;
    }

    @Override
    public void resume() {
        running = true;
    }
}
