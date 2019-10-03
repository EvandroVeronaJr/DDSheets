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
 * https://youtu.be/eeE44RmE1FM?t=193 any doubt at verona.junior@gmail.com
 * https://github.com/EvandroVeronaJr
 *
 * @author Evandro Jr
 */
enum Tela {
    Personagem, Inventario, Magias
}

public class InterFace implements ActionListener {

    JFrame JF;
    Tela TelaExposta;

    public InterFace() {

        JF = new JFrame("Character Sheet");//cria o frame onde vai ficar tudo
        JF.setVisible(true);
        JF.setSize(600, 400);
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreatePanels();
        test();
        SwingUtilities.updateComponentTreeUI(JF);
    }

    JPanel JPButtons, JPButtons1;
    JButton JBsetCha, JBchange1, JBchange2;

    void test() {
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
    JButton JBChacWin, JBEquiWin, JBSpellWin, JBAtualiz;
    JPanel JPCharacter, JPEquips, JPSpells;
    // -------------------------------   Objetos para o panel do character
    JTextArea JTForc, JTDex, JTCon, JTInt, JTSab, JTCari, JTmFor, JTmDex, JTmCon, JTmInt, JTmSab, JTmCari;
    JTextField JTFForc, JTFDex, JTFCon, JTFInt, JTFSab, JTFCari;

    private void CreatePanels() { //     

        JPCabeca = new JPanel();
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

        JPCabeca.add(JTxName, BorderLayout.WEST);
        JPCabeca.add(JBntList, BorderLayout.EAST);

        JF.add(JPCabeca, BorderLayout.NORTH);

        // "special" a proficiência pericia, HPmax HPtemp bonusHP PersepPassiva(é  10+percepção) InvestPassiva (10+investigação)
        JPCharacter = new JPanel();
        JPCharacter.setBackground(Color.lightGray);
        JTForc = new JTextArea("Força");
        JTFForc = new JTextField();
        JTDex = new JTextArea("Dextresa");
        JTFDex = new JTextField();
        JTCon = new JTextArea("Constituição");
        JTFCon = new JTextField();
        JTInt = new JTextArea("Inteligencia");
        JTFInt = new JTextField();
        JTSab = new JTextArea("Sabedoria");
        JTFSab = new JTextField();
        JTCari = new JTextArea("Carisma");
        JTFCari = new JTextField();
        JTmFor = new JTextArea("");
        JTmDex = new JTextArea("");
        JTmCon = new JTextArea("");
        JTmInt = new JTextArea("");
        JTmSab = new JTextArea("");
        JTmCari = new JTextArea("");

        // "special" a proficiência pericia, HPmax HPtemp bonusHP PersepPassiva(é  10+percepção) InvestPassiva (10+investigação)
        JPEquips = new JPanel();
        JPEquips.setBackground(Color.BLUE);

        // dividido em 9 niveis + truques, quantas magias diarias maxima e disponiveis, efeito/descrição 
        JPSpells = new JPanel();
        JPSpells.setBackground(Color.GREEN);
    }

    public void SetNewName(String nname) {
        JF.setName(nname);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == JBsetCha) {
            System.out.println("acetou da onde vem");
        } else if (e.getSource() == JBchange1) {
            JF.remove(JPButtons);
            JF.add(JPButtons1);
            //JF.getContentPane().add(JPButtons1);
        } else if (e.getSource() == JBchange2) {
            JF.remove(JPButtons1);
            //JF.getContentPane().add(JPButtons);
            JF.add(JPButtons);
        } else if (e.getSource() == JBChacWin) {
            JF.remove(JPButtons1);
            JF.remove(JPButtons);
            JF.remove(JPEquips);
            JF.remove(JPSpells);
            JF.add(JPCharacter);
            TelaExposta = TelaExposta.Personagem;
        } else if (e.getSource() == JBEquiWin) {
            JF.remove(JPButtons1);
            JF.remove(JPButtons);
            JF.remove(JPCharacter);
            JF.remove(JPSpells);
            JF.add(JPEquips);
            TelaExposta = TelaExposta.Inventario;
        } else if (e.getSource() == JBSpellWin) {
            JF.remove(JPButtons1);
            JF.remove(JPButtons);
            JF.remove(JPEquips);
            JF.remove(JPCharacter);
            JF.add(JPSpells);
            TelaExposta = TelaExposta.Magias;
        } else if (e.getSource() == JBAtualiz) {
            switch (TelaExposta) {
                case Personagem:
                    JTmFor.setText( Integer.toString(Personagem.Forca.GetModifeirFinal()));
                    JTmDex = new JTextArea(Integer.toString(Personagem.Destreza.GetModifeirFinal()));
                    JTmCon = new JTextArea(Integer.toString(Personagem.Const.GetModifeirFinal()));
                    JTmInt = new JTextArea(Integer.toString(Personagem.Inteli.GetModifeirFinal()));
                    JTmSab = new JTextArea(Integer.toString(Personagem.Sabedo.GetModifeirFinal()));
                    JTmCari = new JTextArea(Integer.toString(Personagem.Carist.GetModifeirFinal()));
                    break;
                case Inventario:
                    break;
                case Magias:
                    break;
            }
        } else {
            System.out.println("errou");
        }

        SwingUtilities.updateComponentTreeUI(JF);

    }

}
