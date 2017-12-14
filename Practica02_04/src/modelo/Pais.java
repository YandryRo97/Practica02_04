/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author PC-MATIC
 */
@Entity
public class Pais implements Serializable 
{
    @Id
    private int id;
    private String nombre;
    private String nacionalidad;
    private int numHabitantes;

    public Pais(int id, String nombre, String nacionalidad, int numHabitantes) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.numHabitantes = numHabitantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    

    

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", numHabitantes=" + numHabitantes + '}';
    }
    
}
