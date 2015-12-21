package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddFrame extends ZooFrame{

	private static final long serialVersionUID = 1L;

	private JButton addAnimalbtn;;
	private JButton addEmployeebtn;
	private JLabel text;	
	
	public AddFrame(String title) {

		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		// example taken from zoo part 6
		text = new JLabel("What will it be?");
		slPanel.putConstraint(SpringLayout.NORTH, text, 30, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, text, 70, SpringLayout.WEST, pan);
		pan.add(text);

		addAnimalbtn = new JButton("Add Animal");
		slPanel.putConstraint(SpringLayout.NORTH, addAnimalbtn, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, addAnimalbtn, 60, SpringLayout.WEST, pan);
		addAnimalbtn.setToolTipText("A cat snaps a rat's paxwax");
		pan.add(addAnimalbtn);

		addEmployeebtn = new JButton("Add Employee");
		slPanel.putConstraint(SpringLayout.NORTH, addEmployeebtn, 150, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, addEmployeebtn, 50, SpringLayout.WEST, pan);
		addEmployeebtn.setToolTipText("When you write copy you have the right to copyright the copy you write.");
		pan.add(addEmployeebtn);

		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);

	} 
	
	public void setAnimalButtonActionListener(ActionListener a) {
		addAnimalbtn.addActionListener(a);
	}

	public void setEmployeeButtonActionListener(ActionListener a) {
		addEmployeebtn.addActionListener(a);
	}
	

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
	
	
}
