package com.me.crutuu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Input.Keys;

public class Input implements InputProcessor {

    public static final int UP = 0;
    public static final int DOWN = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;

    public static final int MELEE = 4;
    public static final int WEAPONE = 5;
    public static final int WEAPTWO = 6;
    public static final int ULT = 7;

    public boolean[] buttons = new boolean[64];
    public boolean[] oldButtons = new boolean[64];
    
    public void set (int key, boolean down) {
        int button = -1;

        if (key == Keys.DPAD_UP) button = UP;
        if (key == Keys.DPAD_LEFT) button = LEFT;
        if (key == Keys.DPAD_DOWN) button = DOWN;
        if (key == Keys.DPAD_RIGHT) button = RIGHT;

        if (key == Keys.Z) button = MELEE;
        if (key == Keys.X) button = WEAPONE;

        if (button >= 0) {
            buttons[button] = down;
        }
    }
    
    public void releaseAllKeys () {
        for (int i = 0; i < buttons.length; i++) {
            if (i == UP || i == DOWN) continue;
            buttons[i] = false;
        }
    }
    
    @Override
    public boolean keyDown(int keycode) {
        set(keycode, true);
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        set(keycode, false);
        return true;
    }

    @Override
    public boolean keyTyped(char character) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        // TODO Auto-generated method stub
        return false;
    }

    public void tick () {
        for (int i = 0; i < buttons.length; i++) {
            oldButtons[i] = buttons[i];
        }
    }
    
}
