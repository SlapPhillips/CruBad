package com.me.crutuu;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "CruTuu";
		
		//making dis shit 720p yo
		cfg.width = 1280;
		cfg.height = 720;
		
		//makin dis shit not resizable yo
		cfg.resizable = false;
		
		//disabling vsync yo
		cfg.vSyncEnabled = false;
		
		//no icon to add yet yo
		//cfg.addIcon(path, fileType);
		new LwjglApplication(new CruTuu(), cfg);
	}
}
