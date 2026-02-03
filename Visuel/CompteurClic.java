package Visuel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CompteurClic extends JFrame {
	private static int cpt=0;
	private static JLabel étiquette= new JLabel("0");

	public static void main(String[] args) {
		CompteurClic  f= new CompteurClic();
		JPanel        leFond= new JPanel();
		JButton       bOk = new JButton("Ok");
		JButton       bQuit= new JButton("Quitter");
		JButton       bInit= new JButton("Réinitialiser");
		
		
        bQuit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Au Revoir" );
				System.exit(0);
				
			}
		});
        bOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cpt++;
				étiquette.setText(""+cpt);
			}
        });
        bInit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cpt=0;
				étiquette.setText(""+cpt);
			}
        });
				
				
		leFond.setBackground(Color.GREEN);
		f.setSize(900, 400);
		f.setTitle("Compteur de Clics");
		f.setLocation(500, 400);
		leFond.add(étiquette);
		leFond.add(bOk);
		leFond.add(bInit);
		leFond.add(bQuit);
		
		f.add(leFond);
		f.setVisible(true);

	}

}
