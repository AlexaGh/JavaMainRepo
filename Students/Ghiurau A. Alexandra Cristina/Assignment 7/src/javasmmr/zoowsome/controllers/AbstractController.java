package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.ZooFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;

public class AbstractController {

	protected ZooFrame frame;

	public AbstractController(ZooFrame frame, boolean hasBackButton) {
		this.frame = frame;
		if (hasBackButton)
			frame.setToolBar(new BackButtonListener());
	}

	private class BackButtonListener implements ActionListener {

		@Override
		public void actionPerformed(final ActionEvent e) {
			FrameStack.getInstance().pop();
		}
	}

}
