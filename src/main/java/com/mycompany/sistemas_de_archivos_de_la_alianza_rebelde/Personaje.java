/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemas_de_archivos_de_la_alianza_rebelde;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "Individuo")
@XmlType(propOrder = {"nombre", "rango"})
@XmlAccessorType(XmlAccessType.FIELD)
/**
 *
 * @author aleja
 */
public class Personaje implements Serializable {

    @XmlElement(name = "nombre")
    private String nombre;
    @XmlElement(name = "rango")
    private String rango;

    public Personaje() {
    }

    public Personaje(String nombre, String rango) {
        this.nombre = nombre;
        this.rango = rango;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the rango
     */
    public String getRango() {
        return rango;
    }

    /**
     * @param rango the rango to set
     */
    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Rango: " + rango;
    }   
}
