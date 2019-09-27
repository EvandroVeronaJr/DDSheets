/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 * any doubt at verona.junior@gmail.com
 * https://github.com/EvandroVeronaJr
 * @author Evandro Jr
 */
enum tipeEquip{ HeadEquip, ArmorEquip, RingEquip, LeftHand, RightHand, BothHands, CapEquip, NonEquipable}
public class Itens {
    public String Nome, Descricao;
    public tipeSt Modificador = tipeSt.Non;
    tipeEquip Tipo = tipeEquip.NonEquipable;
    public int Modifica;
    public float PricePO, Peso;
    public boolean Equipavel;
    public Itens(String Name,String Desc,float Price, float Pezo){
        Nome = Name;
        Descricao = Desc;
        PricePO = Price;
        Peso = Pezo;
    }
    public Itens(String Name,String Desc,float Price, float Pezo, tipeSt modi, int Modifi,tipeEquip Whatis){
        Nome = Name;
        Descricao = Desc;
        PricePO = Price;
        Peso = Pezo;
        Modificador = modi;
        Modifica = Modifi;
        Tipo = Whatis;
    }
    
}
