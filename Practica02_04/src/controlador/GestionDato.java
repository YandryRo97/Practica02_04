/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Equipo;
import modelo.Estadio;
import modelo.Grupo;
import modelo.Jugador;
import modelo.Pais;
import modelo.Torneo;

/**
 *
 * @author Estudiante
 */
public class GestionDato {
    
    private List<Equipo> equipoList;
    private List<Estadio> estadioList;
    private List<Grupo>  grupoList;
    private List<Jugador> jugadorList;
    private List<Pais> paisList;
    private List<Torneo> torneoList;

    public GestionDato(List<Equipo> equipoList, List<Estadio> estadioList, List<Grupo> grupoList, List<Jugador> jugadorList, List<Pais> paisList, List<Torneo> torneoList) {
        this.equipoList = equipoList;
        this.estadioList = estadioList;
        this.grupoList = grupoList;
        this.jugadorList = jugadorList;
        this.paisList = paisList;
        this.torneoList = torneoList;
    }

    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    public List<Estadio> getEstadioList() {
        return estadioList;
    }

    public void setEstadioList(List<Estadio> estadioList) {
        this.estadioList = estadioList;
    }

    public List<Grupo> getGrupoList() {
        return grupoList;
    }

    public void setGrupoList(List<Grupo> grupoList) {
        this.grupoList = grupoList;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public List<Pais> getPaisList() {
        return paisList;
    }

    public void setPaisList(List<Pais> paisList) {
        this.paisList = paisList;
    }

    public List<Torneo> getTorneoList() {
        return torneoList;
    }

    public void setTorneoList(List<Torneo> torneoList) {
        this.torneoList = torneoList;
    }
    
    
    
    
}
