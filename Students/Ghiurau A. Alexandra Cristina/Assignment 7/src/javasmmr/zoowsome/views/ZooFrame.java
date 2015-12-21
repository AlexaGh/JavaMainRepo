package javasmmr.zoowsome.views;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.services.factories.Constants.Frames;
import javasmmr.zoowsome.views.utilities.FrameStack;
import javasmmr.zoowsome.views.utilities.Clock;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

public abstract class ZooFrame extends JFrame implements ZooFrame_I {

	private static final long serialVersionUID = 1L;

	protected JPanel contentPanel;

	public ZooFrame(String title) {
		FrameStack.getInstance().push(this);
		setTitle(title);
		setSize(Frames.WIDTH, Frames.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(Color.green);
		add(contentPanel, BorderLayout.CENTER);
	}

	public void setToolBar(ActionListener a) {

		JToolBar toolBar = new JToolBar("Still draggable");
		setPreferredSize(new Dimension(450, 130));
		setBackButtonActionListener(a, toolBar);
		Clock clock = new Clock();
		clock.setClock(toolBar);
		add(toolBar, BorderLayout.PAGE_START);

	}

	public void setBackButtonActionListener(ActionListener a, JToolBar toolBar) {
		JButton backButton = new JButton("Back");
		backButton.setToolTipText("Retreat!");
		toolBar.add(backButton);
		backButton.addActionListener(a);
	}

}
