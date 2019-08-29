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
public class Personagem {
    static String Name;
    
    static List<Status> Special= new ArrayList<>();
    static Status Forca = new Status(tipeSt.Forca);
    static Status Destreza = new Status(tipeSt.Destreza);
    static Status Const = new Status(tipeSt.Constituicao);
    static Status Inteli = new Status(tipeSt.Inteligencia);
    static Status Sabedo =new Status (tipeSt.Sabedoria);
    static Status Carist = new Status (tipeSt.Carisma);

    
    static void SetStart(){
        Special.add(Forca);
        Special.add(Destreza);
        Special.add(Const);
        Special.add(Inteli);
        Special.add(Sabedo);
        Special.add(Carist);


        
    }    
    
}
