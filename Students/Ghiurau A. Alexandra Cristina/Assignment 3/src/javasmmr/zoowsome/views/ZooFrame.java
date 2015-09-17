package javasmmr.zoowsome.views;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javasmmr.zoowsome.services.factories.Constants.Frames;
import javasmmr.zoowsome.views.utilities.FrameStack;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public abstract class ZooFrame extends JFrame implements ZooFrame_I {

	private JLabel labelImage = new JLabel();

	private JRadioButton btnAquatic = new JRadioButton("Aquatic");
	private JRadioButton btnBird = new JRadioButton("Bird");
	private JRadioButton btnInsect = new JRadioButton("Insect");
	private JRadioButton btnMammal = new JRadioButton("Mammal");
	private JRadioButton btnReptile = new JRadioButton("Reptile");

	private ImageIcon iconAquatic = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/fish.png"));
	private ImageIcon iconBird = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/bird.gif"));
	private ImageIcon iconInsect = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/fly.png"));
	private ImageIcon iconMammal = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/dog.gif"));
	private ImageIcon iconReptile = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/trex2.png"));

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void goBack() {

	}

	protected JPanel contentPanel;

	private JLabel item1;

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

	public void setBackButtonActionListener(ActionListener a) {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton backButton = new JButton("Back");
		buttonPanel.add(backButton);
		this.add(buttonPanel, BorderLayout.NORTH);
		backButton.addActionListener(a);

		item1 = new JLabel("Choose a type of animal:", JLabel.LEADING);
		add(item1);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(btnAquatic);
		buttonGroup.add(btnBird);
		buttonGroup.add(btnInsect);
		buttonGroup.add(btnMammal);
		buttonGroup.add(btnReptile);

		btnAquatic.setMnemonic(KeyEvent.VK_N);
		btnAquatic.setActionCommand("aquatic");
		labelImage.setIcon(iconAquatic);
		btnAquatic.setSelected(true);

		add(btnAquatic);
		add(btnBird);
		add(btnInsect);
		add(btnMammal);
		add(btnReptile);

		setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();

		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 3;

		add(labelImage, constraints);

		RadioButtonActionListener actionListener = new RadioButtonActionListener();
		btnAquatic.addActionListener(actionListener);
		btnBird.addActionListener(actionListener);
		btnInsect.addActionListener(actionListener);
		btnMammal.addActionListener(actionListener);
		btnReptile.addActionListener(actionListener);

		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}

	class RadioButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton button = (JRadioButton) e.getSource();

			if (button == btnAquatic) {

				labelImage.setIcon(iconAquatic);

			} else if (button == btnBird) {

				labelImage.setIcon(iconBird);

			} else if (button == btnInsect) {

				labelImage.setIcon(iconInsect);

			} else if (button == btnMammal) {

				labelImage.setIcon(iconMammal);

			} else if (button == btnReptile) {

				labelImage.setIcon(iconReptile);

			}

		}

	}

}
