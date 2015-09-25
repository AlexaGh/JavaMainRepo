package javasmmr.zoowsome.views;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.views.ZooFrame;

public class AquaticFrameAttributes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private JTextField aqName = new JTextField(10);
	private JTextField aqNrOfLegs = new JTextField(10);
	private JTextField cost = new JTextField(10);
	private JTextField aqDanger = new JTextField(10);
	private JTextField aqSwimDepth = new JTextField(10);
	private JRadioButton freshWater =  new JRadioButton("Fresh Water");
	private JRadioButton saltWater = new JRadioButton("Salt water");

	public AquaticFrameAttributes() {

		super("Choose the attributes for your chosen animal:");
		setLayout(new FlowLayout());
		JPanel pan = new JPanel();
		//contentPanel.add(pan);
		
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(saltWater);
		buttonGroup.add(freshWater);
		
		add(saltWater);
		add(freshWater);

		// add action listener for the check boxes
		ActionListener actionListener2 = new ActionHandler();
		saltWater.addActionListener(actionListener2);
		freshWater.addActionListener(actionListener2);
		
		cost.setToolTipText("Enter cost here");
		slPanel.putConstraint(SpringLayout.NORTH, cost, 195, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, cost, 0, SpringLayout.WEST, pan);
		pan.add(cost);
	}

	class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			JRadioButton button = (JRadioButton) event.getSource();
			
				if (button == freshWater) {
					
				}
				if (button == saltWater) {
					
				}
		}

	}

}
