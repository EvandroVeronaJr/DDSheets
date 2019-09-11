/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;
import javax.swing.*;
import java.awt.*;

/**
 * https://respostas.guj.com.br/5924-jpanel-o-que-e-codigos-e-como-funciona
 * http://www.macs.hw.ac.uk/cs/java-swing-guidebook/?name=JPanel&page=1
 * https://youtu.be/eeE44RmE1FM?t=193
 * any doubt at verona.junior@gmail.com
 * https://github.com/EvandroVeronaJr
 * @author Evandro Jr
 */
public class InterFace {
    
    JFrame JF;
    JPanel JP;
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
        
        JP =new JPanel();
        JP.setBackground(Color.RED);
        
        JBsetCha = new JButton("Set Character");
        JL = new JLabel("test");
        
        JP.add(JBsetCha);
        JP.add(JL);
        
        JF.add(JP,BorderLayout.CENTER);

    }
    
    public void SetNewName(String nname){
        JF.setName(nname);
    }
    
}
