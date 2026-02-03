package Visuel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Calculs extends JFrame {
	
	private static JLabel JLBNb1= new JLabel("0");
	private static JLabel JLBNb2= new JLabel("0");
	private static JTextField JTFReponse= new JTextField();
	
	

	public static void main(String[] args) {
		Calculs f= new Calculs();
		JPanel leFond= new JPanel(),
			   leNord= new JPanel(),
			   leSud= new JPanel();
		
		JButton bCorrection= new JButton("Correction"),
				BInit= new JButton("Nouveau calcul"),
				BQuit= new JButton("Quitter");
		
		JLabel JLBPlus= new JLabel("+"),
			   JLBEgal= new JLabel("=");
		BQuit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Au Revoir" );
					System.exit(0);
					
				}
			});
		BInit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					Init();
					
				}
			});
		bCorrection.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					Correction();
					
				}
			});
		
		f.add(leFond);
		leFond.setLayout(new BorderLayout());
		leFond.add(leNord,BorderLayout.NORTH);
		leFond.add(leSud,BorderLayout.SOUTH);
		
		leNord.setLayout(new GridLayout(1,5));
		leSud.setLayout(new GridLayout(1,3));
		
		leNord.add(JLBNb1);
		leNord.add(JLBPlus);
		leNord.add(JLBNb2);
		leNord.add(JLBEgal);
		leNord.add(JTFReponse);
		
		leSud.add(bCorrection);
		leSud.add(BInit);
		leSud.add(BQuit);
		
		leFond.setBackground(Color.BLUE);
		leNord.setBackground(Color.CYAN);
		
		f.setSize(500,300);
		Init();
		f.setVisible(true);
		
		

	}
private static void Init () {
	Random r = new Random();
	int nb1,nb2;
	nb1=r.nextInt(21);
	nb2=r.nextInt(21);
	JLBNb1.setText(nb1+"");
	JLBNb2.setText(nb2+ "");
}
private static void Correction() {
	int nb1,nb2,somme,Reponse;
	nb1=Integer.parseInt(JLBNb1.getText());
	nb2=Integer.parseInt(JLBNb2.getText());
	Reponse = Integer.parseInt(JTFReponse.getText());
	somme=nb1+nb2;
	if(somme==Reponse) {
		JOptionPane.showMessageDialog(null, "Bravo, miptifi " );
	}
	else {
		JOptionPane.showMessageDialog(null, "Je suis désolé de t'annoncer" + "que tu as une mauvaise reponse, c'était" +somme );
	}
}
}


