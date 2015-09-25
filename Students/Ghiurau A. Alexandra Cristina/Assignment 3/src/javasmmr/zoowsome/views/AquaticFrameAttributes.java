package javasmmr.zoowsome.views;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AquaticFrameAttributes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JCheckBox saltWater = new JCheckBox("Salt water");
	private JCheckBox freshWater = new JCheckBox("Fresh Water");

	public AquaticFrameAttributes() {

		super("Choose the attributes for your chosen animal:");
		setLayout(new FlowLayout());

		add(saltWater);
		add(freshWater);

		// add action listener for the check boxes
		ActionListener actionListener2 = new ActionHandler();
		saltWater.addActionListener(actionListener2);
		freshWater.addActionListener(actionListener2);
	}

	class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			JCheckBox checkbox = (JCheckBox) event.getSource();
			int op1 = 0;
			int op2 = 0;
			if (checkbox.isSelected()) {
				if (checkbox == saltWater) {
					op1 = 1;
				}
				if (checkbox == freshWater) {
					op2 = 1;
				}
				if ((op1 == 1) && (op2 == 1)) {
					JOptionPane.showMessageDialog(null, "You cannot have both salt and fresh water! Choose one!");
				}
			}
		}

	}

}
