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
    
    
    public InterFace(){
        
        
        JF = new JFrame("Character Sheet");//cria o frame onde vai ficar tudo
        JF.setVisible(true);
        JF.setSize(600,400);
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreateCabecario();
        test();
        SwingUtilities.updateComponentTreeUI(JF);
    }
    
    JPanel JPButtons,JPButtons1;
    JButton JBsetCha, JBchange1,JBchange2;
    
    void test(){
        JPButtons = new JPanel();
        JPButtons1 = new JPanel();
        
        JPButtons.setBackground(Color.YELLOW);
        JPButtons1.setBackground(Color.BLUE);
        
        
        
        JBsetCha = new JButton("Set Character");
        JBsetCha.addActionListener(this);
        
        JBchange1 = new JButton("troca TEla 1");
        JBchange1.addActionListener(this);
        
        JBchange2 = new JButton("troca TEla 2");
        JBchange2.addActionListener(this);
        
        
        JPButtons.add(JBsetCha);
        JPButtons.add(JBchange1);
        JPButtons1.add(JBchange2);
        
        
        
        JF.add(JPButtons);
    }
    
    JPanel JPCabeca, JBntList;
    JTextField JTxName;
    JButton JBChacWin,JBEquiWin,JBSpellWin;
    
    
    private void CreateCabecario(){      
        
        JPCabeca =new JPanel();
        JPCabeca.setBackground(Color.RED);
        JBntList = new JPanel();
        
        JTxName = new JTextField("nome do personagem");
        
        JBChacWin = new JButton("Character");
        JBChacWin.addActionListener(this);
        JBEquiWin = new JButton("Equipment");
        JBEquiWin.addActionListener(this);
        JBSpellWin = new JButton("Spells");
        JBSpellWin.addActionListener(this);
        
        JBntList.add(JBChacWin);
        JBntList.add(JBEquiWin);
        JBntList.add(JBSpellWin);
        
        
        JPCabeca.add(JTxName,BorderLayout.WEST);
        JPCabeca.add(JBntList,BorderLayout.EAST);
        
        JF.add(JPCabeca,BorderLayout.NORTH);


    }
    JPanel JPCharacter;
    void CreateChrStatusPanel(){// "special" a proficiência pericia, HPmax HPtemp bonusHP PersepPassiva(é  10+percepção) InvestPassiva (10+investigação)
        JPCharacter = new JPanel();
    }
    void CreateChrEquipsPanel(){// Nome dos Itens se estão equipados, o modificador e oq eles modificão, preço em  PO
        
    }
    void CreateChrSpellPanel(){// dividido em 9 niveis + truques, quantas magias diarias maxima e disponiveis, efeito/descrição 
        
    }
    public void SetNewName(String nname){
        JF.setName(nname);
    }
    
    public void actionPerformed(ActionEvent e){ 
        if(e.getSource() == JBsetCha){
        System.out.println("acetou da onde vem");
        }else if(e.getSource() == JBchange1){
            JF.remove(JPButtons);
            JF.add(JPButtons1); 
            //JF.getContentPane().add(JPButtons1);
            SwingUtilities.updateComponentTreeUI(JF);
        }else if(e.getSource() == JBchange2){
            JF.remove(JPButtons1);
            //JF.getContentPane().add(JPButtons);
            JF.add(JPButtons);
            SwingUtilities.updateComponentTreeUI(JF);
        }
        else{
            System.out.println("errou");
        }
        
    }  
    
}
