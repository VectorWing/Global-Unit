package com.vectorwing.apps.globalunit;

import java.awt.EventQueue;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import com.vectorwing.apps.globalunit.gui.PanelMain;

public class UnitSwap extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public UnitSwap()
	{
		initSettings();
		initLayout();
	}
	
	private void initSettings()
	{
		this.setTitle("Unit Swap");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		this.setResizable(false);
	}
	
	private void initLayout()
	{
		PanelMain panel = new PanelMain();
		this.setContentPane(panel);
		
		this.pack();
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                UnitSwap main = new UnitSwap();
                main.setVisible(true);
            }
        });

	}

}
