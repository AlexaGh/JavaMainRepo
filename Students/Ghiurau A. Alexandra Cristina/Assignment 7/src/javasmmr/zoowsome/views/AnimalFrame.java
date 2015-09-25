package javasmmr.zoowsome.views;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.views.ZooFrame;

public class AnimalFrame extends ZooFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel labelImage = new JLabel();
	
	private ImageIcon iconAquatic = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/fish.png"));
	private ImageIcon iconBird = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/bird.gif"));
	private ImageIcon iconInsect = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/fly.png"));
	private ImageIcon iconMammal = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/dog.gif"));
	private ImageIcon iconReptile = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/trex2.png"));
	
	private ImageIcon iconSeaHorse = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/seahorse.png"));
	private ImageIcon iconSeaTurtle = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/seaturtle.png"));
	private ImageIcon iconMoonJellyFish = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/jellyfish.png"));


	private JButton btnAquatic = new JButton("Aquatic", iconAquatic);
	private JButton btnBird = new JButton("Bird", iconBird);
	private JButton btnInsect = new JButton("Insect", iconInsect);
	private JButton btnMammal = new JButton("Mammal", iconMammal);
	private JButton btnReptile = new JButton("Reptile", iconReptile);
	
	private JRadioButton btnSeaHorse = new JRadioButton("SeaHorse");
	private JRadioButton btnSeaTurtle = new JRadioButton("SeaTurtle");
	private JRadioButton btnMoonJellyFish = new JRadioButton("MoonJellyfish");
	private JRadioButton btnDove = new JRadioButton("Dove");
	private JRadioButton btnWoodpecker = new JRadioButton("Woodpecker");
	private JRadioButton btnNightingale = new JRadioButton("Nightingale");
	private JRadioButton btnButterfly = new JRadioButton("Butterfly");
	private JRadioButton btnLadyBug = new JRadioButton("LadyBug");
	private JRadioButton btnSpider = new JRadioButton("Spider");
	private JRadioButton btnCow = new JRadioButton("Cow");
	private JRadioButton btnMonkey = new JRadioButton("Monkey");
	private JRadioButton btnTiger = new JRadioButton("Tiger");
	private JRadioButton btnTurtle = new JRadioButton("Turtle");
	private JRadioButton btnDragon = new JRadioButton("Dragon");
	private JRadioButton btnCroco = new JRadioButton("Crocodile");


	private JLabel text;

	public AnimalFrame() {

		super("ZOOWSOME. Choosing the animal type.");
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		text = new JLabel("Choose:");
		pan.add(text);

		add(btnAquatic);
		add(btnBird);
		add(btnInsect);
		add(btnMammal);
		add(btnReptile);
	
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(btnSeaHorse);
		buttonGroup.add(btnSeaTurtle);
		buttonGroup.add(btnMoonJellyFish);
		buttonGroup.add(btnDove);
		buttonGroup.add(btnWoodpecker);
		buttonGroup.add(btnNightingale);
		buttonGroup.add(btnButterfly);
		buttonGroup.add(btnLadyBug);
		buttonGroup.add(btnSpider);	
		buttonGroup.add(btnCow);
		buttonGroup.add(btnMonkey);
		buttonGroup.add(btnTiger);
		buttonGroup.add(btnTurtle);
		buttonGroup.add(btnDragon);
		buttonGroup.add(btnCroco);

		
		// first option will appear as marked/"chosen"
		/*btnAquatic.setMnemonic(KeyEvent.VK_N);
		btnAquatic.setActionCommand("aquatic");
		labelImage.setIcon(iconAquatic);
		btnAquatic.setSelected(true);*/

		setLayout(new GridLayout(0, 3, 0, 0));
		/*GridBagConstraints constraints = new GridBagConstraints();

		constraints.ipady = 20;
		constraints.weightx = 0.5;
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		constraints.gridy = 0;
		add(labelImage, constraints);*/

		ButtonActionListener actionListener = new ButtonActionListener();
		btnAquatic.addActionListener(actionListener);
		btnBird.addActionListener(actionListener);
		btnInsect.addActionListener(actionListener);
		btnMammal.addActionListener(actionListener);
	 	btnReptile.addActionListener(actionListener);
		
		btnSeaHorse.addActionListener(actionListener);
		btnSeaTurtle.addActionListener(actionListener);
		btnMoonJellyFish.addActionListener(actionListener);
		btnDove.addActionListener(actionListener);
		btnWoodpecker.addActionListener(actionListener);
		btnNightingale.addActionListener(actionListener);
		btnButterfly.addActionListener(actionListener);
		btnLadyBug.addActionListener(actionListener);
		btnSpider.addActionListener(actionListener);
		btnCow.addActionListener(actionListener);
		btnMonkey.addActionListener(actionListener);
		btnTiger.addActionListener(actionListener);
		btnTurtle.addActionListener(actionListener);
		btnDragon.addActionListener(actionListener);
		btnCroco.addActionListener(actionListener);

		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	class ButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			JButton button = (JButton) e.getSource();		
			if (button == btnAquatic) {

				AquaticFrame alexa = new AquaticFrame();
				alexa.setVisible(true);
				alexa.setSize(600, 300);
				alexa.setLocation(450, 200);

				/*if (but == btnSeaTurtle) {
					
					labelImage.setIcon(iconSeaTurtle);

				} else if (but == btnSeaHorse) {
					
					labelImage.setIcon(iconSeaHorse);

				} else if (but == btnMoonJellyFish) {

					labelImage.setIcon(iconMoonJellyFish);


			}*/
				}
			if (button == btnBird) {
				
				add(btnDove, true);
				add(btnWoodpecker, true);
				add(btnNightingale, true);


			}
			if (button == btnInsect) {
				
				add(btnButterfly);
				add(btnLadyBug);
				add(btnSpider);
				

			}
			if (button == btnMammal) {

				add(btnSpider);
				add(btnCow);
				add(btnMonkey);
				add(btnTiger);
				setVisible(true);

			}
			if (button == btnReptile) {

				add(btnTurtle);
				add(btnDragon);
				add(btnCroco);
				setVisible(true);

			}

		}

	}
	
	public void setBtnAquatic(ActionListener a) {
		btnAquatic.addActionListener(a);
	}

	public void setBtnBird(ActionListener a) {
		btnBird.addActionListener(a);
	}

	public void setBtnInsect(ActionListener a) {
		btnInsect.addActionListener(a);
	}
	

	public void setBtnMammal(ActionListener a) {
		btnMammal.addActionListener(a);
	}

	public void setBtnReptile(ActionListener a) {
		btnReptile.addActionListener(a);
	}


	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

}
