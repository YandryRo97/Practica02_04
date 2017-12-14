/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_04;

import java.util.ArrayList;
import java.util.List;
import controlador.GestionDato;
import modelo.Equipo;
import modelo.Estadio;
import modelo.Grupo;
import modelo.Jugador;
import modelo.Pais;
import modelo.Torneo;
import vista.VentanaPrincipal;

/**
 *
 * @author PC-MATIC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Pais p = new Pais(Long.parseLong("593"),"Ecuador","Ecuatoriana",Long.parseLong("140000"));
       GestionDato gD= new GestionDato();
       gD.persistirPais(p);
        //VentanaPrincipal v = new VentanaPrincipal("Torneo Mundial",gD);
        //v.setVisible(true);
    }
    
}
