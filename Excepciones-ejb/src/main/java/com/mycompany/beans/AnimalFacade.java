/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.AnimalFacadeLocal;
import com.mycompany.entity.Animal;
import com.mycompany.excepciones.NoArroba;
import com.mycompany.excepciones.NoIguales;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Admin
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class AnimalFacade extends AbstractFacade<Animal> implements AnimalFacadeLocal {
    @PersistenceContext(unitName = "ex")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AnimalFacade() {
        super(Animal.class);
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarNa(Animal animal) throws NoArroba{
        create(animal);
        if(animal.getNombre().contains("@")){
            throw new NoArroba("El campo nombre no puede contener el caracter @");
        }
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarNI(Animal animal, int a, int b) throws NoIguales{
        create(animal);
        if(a == b){
            throw new NoIguales("Los digitos de la operación no pueden ser iguales.");
        }else{
            System.out.println("Resultado: "+ (a+b));
        }
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarDivision(Animal animal, int a, int b) throws ArithmeticException {
        create(animal);
        if(b == 0)
            throw new ArithmeticException();
        else
            System.out.println("Resultado: "+(a / b));
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarArchivo(Animal animal) throws Exception {
        create(animal);
        try{
        Desktop archivo = Desktop.getDesktop();
        archivo.open(new File("archivo.txt"));
        }catch(Exception ioex){
            throw new Exception("Archivo no existe.");
        }
    }
}
