package swind;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.*;

public class Main{
    public static void main(String[]args){


    Frame fenetre = new Frame("bienvenue");


    Label labelmessage = new Label("tape ton nom et clique");

    TextField champ = new TextField(20);
    Button Buttonafficher = new Button("afficher");

    fenetre.setLayout(new FlowLayout());
    fenetre.add(labelmessage);
    fenetre.add(champ);
    fenetre.add(Buttonafficher);
    Buttonafficher.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String nom = champ.getText();
            labelmessage.setText("Bonjour " + nom);

        }
    });
        fenetre.setSize(300,150);
        fenetre.setVisible(true);
        fenetre.addWindowListener(new WindowAdapter() {
            public void addWindowListener(WindowEvent e) {
                System.exit(0);
            }
        });

}}