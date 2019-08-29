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


public class Pericias {
    tipeSt BaseStatus;
    boolean proeficiencia;
    public int base;
    
    public Pericias(tipeSt base){
        BaseStatus = base;
        for(Status Esp:Personagem.Special ){
            if(BaseStatus == Esp.Special){
            this.base = Esp.GetModifeirFinal();
            }
        }
    }
    
}
