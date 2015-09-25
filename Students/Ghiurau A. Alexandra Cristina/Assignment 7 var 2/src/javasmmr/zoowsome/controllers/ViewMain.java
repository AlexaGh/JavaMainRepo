package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.MainMenuFrame;

public class ViewMain {

	public static void main(String[] args) {
		new MainMenuController(new MainMenuFrame("Main Menu"), false);
	}
}
