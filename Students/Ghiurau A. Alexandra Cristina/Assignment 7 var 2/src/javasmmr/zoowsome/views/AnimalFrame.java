package javasmmr.zoowsome.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import javasmmr.zoowsome.views.ZooFrame;

public class AnimalFrame extends ZooFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	private JLabel item1;

	AquaticFrame alexaa = new AquaticFrame();

	public AnimalFrame() {
		
		super("Choose your type of animal");
		item1 = new JLabel("Choose a type of animal:", JLabel.LEADING);
		add(item1);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(btnAquatic);
		buttonGroup.add(btnBird);
		buttonGroup.add(btnInsect);
		buttonGroup.add(btnMammal);
		buttonGroup.add(btnReptile);

		// first option will appear as marked/"chosen"
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
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}

	class RadioButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton button = (JRadioButton) e.getSource();

			if (button == btnAquatic) {

				labelImage.setIcon(iconAquatic);
				alexaa.setSize(600, 300);
				alexaa.setLocation(40, 200);
				alexaa.setVisible(true);

			} else if (button == btnBird) {

				labelImage.setIcon(iconBird);
				alexaa.setSize(600, 300);
				alexaa.setLocation(40, 200);
				alexaa.setVisible(true);
				

			} else if (button == btnInsect) {

				labelImage.setIcon(iconInsect);
				alexaa.setSize(600, 300);
				alexaa.setLocation(40, 200);
				alexaa.setVisible(true);

			} else if (button == btnMammal) {

				labelImage.setIcon(iconMammal);
				alexaa.setSize(600, 300);
				alexaa.setLocation(40, 200);
				alexaa.setVisible(true);

			} else if (button == btnReptile) {

				labelImage.setIcon(iconReptile);
				alexaa.setSize(600, 300);
				alexaa.setLocation(40, 200);
				alexaa.setVisible(true);

			}

		}

	}
}
