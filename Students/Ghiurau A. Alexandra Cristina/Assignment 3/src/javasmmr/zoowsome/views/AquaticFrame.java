package javasmmr.zoowsome.views;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class AquaticFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JRadioButton SeaTurtleButton = new JRadioButton("Sea Turtle");
	private JRadioButton SeaHorseButton = new JRadioButton("Sea Horse");
	private JRadioButton MoonJellyButton = new JRadioButton("MoonJellyfish");

	AquaticFrameAttributes alexaa = new AquaticFrameAttributes();

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

	}

	class RadioButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			JRadioButton button = (JRadioButton) event.getSource();

			if (button == SeaTurtleButton) {

				alexaa.setSize(600, 300);
				alexaa.setLocation(450, 200);
				alexaa.setVisible(true);

			} else if (button == SeaHorseButton) {

				alexaa.setSize(600, 300);
				alexaa.setLocation(450, 200);
				alexaa.setVisible(true);

			} else if (button == MoonJellyButton) {

				alexaa.setSize(600, 300);
				alexaa.setLocation(450, 200);
				alexaa.setVisible(true);

			}

		}
	}

}