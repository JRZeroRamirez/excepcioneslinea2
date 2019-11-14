/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlador;

import com.mycompany.entity.Animal;
import com.mycompany.excepciones.ExGenerica;
import com.mycompany.interfaces.BeanIntermedioLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Admin
 */
@Named
@RequestScoped
public class IndexController implements Serializable{

    @EJB
    BeanIntermedioLocal bean;
    
    private String nombre;
    private int a;
    private int b;
    /**
     * Creates a new instance of IndexController
     */
    public IndexController() {
    }
    
    public void agregarNoA(){
        Animal animal = new Animal(nombre);
        try{
            bean.agregarNoA(animal);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Completado!", "La operación ha sito completada");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }catch(ExGenerica ex){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + ex.getMessage(), "Si el error persiste comuniquese con el administrador");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    public void agregarNoI(){
        Animal animal = new Animal(nombre);
        try{
            bean.agregarNoI(animal, a, b);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Completado!", "La operación ha sito completada");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }catch(ExGenerica ex){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + ex.getMessage(), "Si el error persiste comuniquese con el administrador");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    public void agregarDivision(){
        Animal animal = new Animal(nombre);
        try{
            bean.agregarDivision(animal, a, b);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Completado!", "La operación ha sito completada");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }catch(ExGenerica ex){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + ex.getMessage(), "Si el error persiste comuniquese con el administrador");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    public void agregarArchivo(){
        Animal animal = new Animal(nombre);
        try{
            bean.agregarArchivo(animal);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Completado!", "La operación ha sito completada");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }catch(ExGenerica ex){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + ex.getMessage(), "Si el error persiste comuniquese con el administrador");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    
}
