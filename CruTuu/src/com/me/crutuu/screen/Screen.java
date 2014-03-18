package com.me.crutuu.screen;

import java.util.Random;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Matrix4;
import com.me.crutuu.CruTuu;
import com.me.crutuu.Input;

public abstract class Screen {
    protected static Random random = new Random();
    private CruTuu crutuu;
    public SpriteBatch spriteBatch;

    public void removed () {
        spriteBatch.dispose();
    }

    public final void init (CruTuu crutuu) {
        this.crutuu = crutuu;
        Matrix4 projection = new Matrix4();
        projection.setToOrtho2D(0, 0, 1280, 720);

        spriteBatch = new SpriteBatch();
        spriteBatch.setProjectionMatrix(projection);
    }

    public void setScreen (Screen screen) {
        crutuu.setScreen(screen);
    }

    public void draw (TextureRegion region, int x, int y) {
        int width = region.getRegionWidth();
        if (width < 0) width = -width;
        spriteBatch.draw(region, x, y, width, region.getRegionHeight());
    }

    public abstract void render ();

    public void tick (Input input) {
    }
}
