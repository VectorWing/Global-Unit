package com.vectorwing.apps.globalunit.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.vectorwing.apps.globalunit.util.Fonts;

public class PanelConversion extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel				txt_convert_from;
	private JLabel				txt_convert_to;
	private JComboBox<String>	select_unit_from;
	private JComboBox<String>	select_unit_to;
	private JTextField			value_from;
	private JTextField			value_to;
	
	public PanelConversion()
	{
		initSettings();
		initLayout();
	}
	
	private void initSettings()
	{
		this.setLayout(new GridBagLayout());
	}
	
	private void initLayout()
	{
		GridBagConstraints gbc = new GridBagConstraints();
		
		txt_convert_from = new JLabel("Convert from:");
		txt_convert_from.setFont(Fonts.normal);
		gbc.insets = new Insets(8, 8, 8, 8);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		add(txt_convert_from, gbc);
		
		select_unit_from = new JComboBox<String>();
		select_unit_from.addItem("Celsius");
		gbc.insets = new Insets(0, 8, 8, 8);
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(select_unit_from, gbc);
		
		value_from = new JTextField();
		Dimension d = value_from.getPreferredSize();
		value_from.setPreferredSize(new Dimension(160, (int) (d.height*2)));
		value_from.setFont(Fonts.field_value);
		gbc.insets = new Insets(8, 8, 8, 8);
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = 2;
		gbc.anchor = GridBagConstraints.SOUTHWEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(value_from, gbc);
		
		gbc.gridheight = 1;
		
		txt_convert_to = new JLabel("Convert to:");
		txt_convert_to.setFont(Fonts.normal);
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(txt_convert_to, gbc);
		
		select_unit_to = new JComboBox<String>();
		select_unit_to.addItem("Kelvin");
		gbc.insets = new Insets(0, 8, 8, 8);
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(select_unit_to, gbc);
		
		value_to = new JTextField();
		d = value_to.getPreferredSize();
		value_to.setPreferredSize(new Dimension(160, (int) (d.height*2)));
		value_to.setFont(Fonts.field_value);
		gbc.insets = new Insets(8, 8, 8, 8);
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridheight = 2;
		gbc.anchor = GridBagConstraints.SOUTHWEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(value_to, gbc);
	}

}
