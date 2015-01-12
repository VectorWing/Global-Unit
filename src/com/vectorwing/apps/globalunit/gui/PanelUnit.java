package com.vectorwing.apps.globalunit.gui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.vectorwing.apps.globalunit.event.EventObserver;
import com.vectorwing.apps.globalunit.util.Measures;

/**
 ** Small panel that displays a value converted to a given unit.
 **/
public class PanelUnit extends JPanel implements EventObserver {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel		txt_unit_name;
	private JTextField	unit_value;
	private JButton		unit_disable;
	private boolean		is_selected;
	
	public PanelUnit()
	{
		initSettings();
		initLayout();
	}
	
	private void initSettings()
	{
		this.setLayout(new GridBagLayout());
		this.setBackground(Color.CYAN);
	}

	private void initLayout()
	{
		GridBagConstraints gbc = new GridBagConstraints(); 
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = Measures.INSET_TITLE;
		this.txt_unit_name = new JLabel("Sample Unit");
		this.add(txt_unit_name, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = Measures.INSET_LEFT;
		this.unit_value = new JTextField();
		this.unit_value.setEditable(false);
		this.add(unit_value, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.gridheight = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = Measures.INSET_FULL;
		this.unit_disable = new JButton("X");
		this.add(unit_disable, gbc);
	}

	@Override
	public void update() {
		 		
	}
	
}
