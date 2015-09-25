package javasmmr.zoowsome.views;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class AquaticFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel labelImage = new JLabel();

	private JRadioButton SeaTurtleButton = new JRadioButton("Sea Turtle");
	private JRadioButton SeaHorseButton = new JRadioButton("Sea Horse");
	private JRadioButton MoonJellyButton = new JRadioButton("MoonJellyfish");
	
	private ImageIcon iconSeaTurtle = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/turtle.png"));
	private ImageIcon iconSeaHorse = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/seahorse.png"));
	private ImageIcon iconJelly = new ImageIcon(getClass().getResource("/javasmmr/zoowsome/views/jellyfish.png"));

	//AquaticFrameAttributes alexaa = new AquaticFrameAttributes();

	public AquaticFrame() {

		super("Choose your animal:");
		setLayout(new FlowLayout());

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(SeaTurtleButton);
		buttonGroup.add(SeaHorseButton);
		buttonGroup.add(MoonJellyButton);

		add(SeaTurtleButton);
		add(SeaHorseButton);
		add(MoonJellyButton);

		RadioButtonActionListener actionListener = new RadioButtonActionListener();
		SeaTurtleButton.addActionListener(actionListener);
		SeaHorseButton.addActionListener(actionListener);
		MoonJellyButton.addActionListener(actionListener);
		
		setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();

		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 3;

		add(labelImage, constraints);

	}

	class RadioButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			JRadioButton button = (JRadioButton) event.getSource();

			if (button == SeaTurtleButton) {
				
				labelImage.setIcon(iconSeaTurtle);
			//	alexaa.setSize(600, 300);
				//alexaa.setLocation(450, 200);
				//alexaa.setVisible(true);

			} else if (button == SeaHorseButton) {
				
				labelImage.setIcon(iconSeaHorse);
			//	alexaa.setSize(600, 300);
			//	alexaa.setLocation(450, 200);
				//alexaa.setVisible(true);

			} else if (button == MoonJellyButton) {

				labelImage.setIcon(iconJelly);
				//alexaa.setSize(600, 300);
				//alexaa.setLocation(450, 200);
				//alexaa.setVisible(true);

			}

		}
	}
}