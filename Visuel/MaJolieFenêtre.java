package Visuel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MaJolieFenêtre extends JFrame {

	public static void main(String[] args) {
		// 
		MaJolieFenêtre f= new MaJolieFenêtre();
		JPanel leFond = new JPanel();
		JButton b1= new JButton();
		b1.setText("Quitter");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Au Revoir" );
				System.exit(0);
				
			}
		});
		
		
		
		
		leFond.setBackground(Color.BLUE);
		f.add(leFond);
		f.setTitle("la plus jolie fenêtre bleu du monde entier" );
		f.setSize(600, 400);
		f.setLocation(700, 400);
		leFond.add(b1);
		f.pack();
		f.setVisible(true);
		

	}

}
