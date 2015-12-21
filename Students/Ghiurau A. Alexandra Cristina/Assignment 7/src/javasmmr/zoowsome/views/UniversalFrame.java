package javasmmr.zoowsome.views;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class UniversalFrame extends ZooFrame {

	String[] attributes;
	JTextField[] textFieldAttributes;

	public UniversalFrame(String title) {
		super(title);

		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

	}

	private static final long serialVersionUID = 1L;

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}

}
