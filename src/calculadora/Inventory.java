/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;
import java.util.List;
import java.util.ArrayList;

/**
 * any doubt at verona.junior@gmail.com
 * https://github.com/EvandroVeronaJr
 * @author Evandro Jr
 */
enum Moneys{pCobre,pPrata,pElectro,pOuro,pPlatina}
public class Inventory {
    public static List<Itens> ItensList = new ArrayList<>(); 
    static float PC;
    
    public void NewItens(String Name,String Desc,float Price, float Pezo){
        ItensList.add(new Itens( Name, Desc, Price,  Pezo));
    }
    
    public void NewItens(String Name,String Desc,float Price, float Pezo, tipeSt modi, int Modifi,tipeEquip Whatis){
        ItensList.add(new Itens( Name, Desc, Price,  Pezo,  modi,  Modifi, Whatis));
    }
    
    public void RemoveIten(String Name){
        for(int i = 0; i<ItensList.size();i++){
            if(ItensList.get(i).Nome == Name){
                ItensList.remove(i);
                break;
            }
        }
    }
    
    public Itens GetItem(String Name){
        Itens Final = null;
        for(int i = 0; i<ItensList.size();i++){
            if(ItensList.get(i).Nome == Name){
                Final = ItensList.get(i);
                break;
            }
        }
        return Final;
    }
    
    public float GetMoney(Moneys Convert){
        float convercao;
        switch(Convert){
            case pCobre:
                convercao = PC;
                break;
            case pPrata:
                convercao = PC / 10;
                break;
            case pElectro:
                convercao = PC / 50;
                break;
            case pOuro:
                convercao = PC / 100;
                break;
            case pPlatina:
                convercao = PC / 1000;
                break;
            default:
                convercao=PC;
                    break;
        }        
        return convercao;
    }
}
