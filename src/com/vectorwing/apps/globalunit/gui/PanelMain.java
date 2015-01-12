package com.vectorwing.apps.globalunit.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class PanelMain extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//private PanelOptions	panel_options;
	//private PanelConversion	panel_convert;
	private PanelUnit		panel_unit;
	
	public PanelMain()
	{
		initSettings();
		initLayout();
	}
	
	private void initSettings() {
		this.setLayout(new GridBagLayout());		
	}

	private void initLayout()
	{
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets.set(16, 16, 16, 16);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		this.panel_unit = new PanelUnit();
		add(panel_unit, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets.set(16, 16, 16, 16);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		this.panel_unit = new PanelUnit();
		add(panel_unit, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.insets.set(16, 16, 16, 16);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		this.panel_unit = new PanelUnit();
		add(panel_unit, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.insets.set(16, 16, 16, 16);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		this.panel_unit = new PanelUnit();
		add(panel_unit, gbc);
	}
	
}
