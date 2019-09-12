/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

/**
 * https://respostas.guj.com.br/5924-jpanel-o-que-e-codigos-e-como-funciona
 * http://www.macs.hw.ac.uk/cs/java-swing-guidebook/?name=JPanel&page=1
 * https://youtu.be/eeE44RmE1FM?t=193
 * any doubt at verona.junior@gmail.com
 * https://github.com/EvandroVeronaJr
 * @author Evandro Jr
 */
public class InterFace implements  ActionListener{
    
    JFrame JF;
    JPanel JPCabeca, JPButtons;
    JButton JBsetCha;
    JLabel JL;
    
    public InterFace(){
        GUI();
    }
    
    private void GUI(){
        
        JF = new JFrame("Character Sheet");
        JF.setVisible(true);
        JF.setSize(600,400);
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPCabeca =new JPanel();
        JPCabeca.setBackground(Color.RED);
        JPButtons = new JPanel();
        
        
        JBsetCha = new JButton("Set Character");
        JBsetCha.addActionListener(this);
        JL = new JLabel("test");
        
        JPCabeca.add(JL);
        JPButtons.add(JBsetCha);
        
        JF.add(JPCabeca,BorderLayout.NORTH);
        JF.add(JPButtons);
        

    }
    
    public void SetNewName(String nname){
        JF.setName(nname);
    }
    
    public void actionPerformed(ActionEvent e){  
        if(e.getSource() == JBsetCha){
        System.out.println("acetou da onde vem");
        }else{
            System.out.println("errou");
        }
    }  
    
}
