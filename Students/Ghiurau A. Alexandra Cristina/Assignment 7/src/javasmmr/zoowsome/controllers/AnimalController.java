package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AnimalFrame;

public class AnimalController extends AbstractController {
	public AnimalController(AnimalFrame animalFrame, boolean hasBackButton) {

		super(animalFrame, hasBackButton);

	//	animalFrame.setBtnMammal(new MammalButtonActionListener());
		animalFrame.setBtnBird(new BirdButtonActionListener());
		animalFrame.setBtnAquatic(new AquaticButtonActionListener());
	//	animalFrame.setBtnReptile(new ReptileButtonActionListener());
		animalFrame.setBtnInsect(new InsectButtonActionListener());
		//animalFrame.setBackButtonActionListener(new BackButt);
	}


	private class MammalButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		//	new MammalController(new MammalFrame("Mammal"), true);
		}
	}

	private class AquaticButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			//new AquaticController(new AquaticFrame("Aquatic"), true);
		}
	}

	private class ReptileButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			//new ReptileController(new ReptileFrame("Reptile"), true);
		}
	}

	private class InsectButtonActionListener implements ActionListener {

	@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}

	private class BirdButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			//new BirdController(new BirdFrame("Bird"), true);
		}
	}
}
