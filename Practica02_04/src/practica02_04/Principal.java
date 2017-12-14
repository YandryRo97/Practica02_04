/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_04;

import java.util.ArrayList;
import java.util.List;
import practica02_04.controlador.GestionDato;
import practica02_04.modelo.Equipo;
import practica02_04.modelo.Estadio;
import practica02_04.modelo.Grupo;
import practica02_04.modelo.Jugador;
import practica02_04.modelo.Pais;
import practica02_04.modelo.Torneo;
import practica02_04.vista.VentanaPrincipal;

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
        
        List<Equipo> eL = new ArrayList<Equipo>();
        List<Estadio> esL = new ArrayList<Estadio>();
        List<Grupo> gL = new ArrayList<Grupo>();
        List<Jugador> jL = new ArrayList<Jugador>();
        List<Pais> pL = new ArrayList<Pais>();
        List<Torneo> tL = new ArrayList<Torneo>();
       
        
        GestionDato gD = new GestionDato(eL, esL, gL, jL, pL, tL);
        VentanaPrincipal v = new VentanaPrincipal("Torneo Mundial",gD);
        v.setVisible(true);
    }
    
}
