/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Evandro Jr
 */

enum tipeSt{Forca, Destreza, Constituicao, Inteligencia, Sabedoria, Carisma,Non}
public class Status {
     int InitialStatus, FinalStatus, modifierBase, modifeirFinal, somaEquip;
     public tipeSt Special;
     boolean proeficiente;
     
     public Status(tipeSt ThisSpecial){
         ThisSpecial = Special;
     }
     public void SetProeficiencia(boolean a){
         proeficiente = a;
     }
     public void attStatus(int status){
         InitialStatus = status;  
         modifierBase = (InitialStatus -10) /2;
    }
     public void upgradeStatus(int status){
         InitialStatus += status;  
         modifierBase = (InitialStatus -10) /2;
    }
     
     public int GetModifeirFinal(){
         return modifeirFinal;
     }
     
     public void finalStatus(){//atualzar os valores com base em itens e afins
         
     }
}
