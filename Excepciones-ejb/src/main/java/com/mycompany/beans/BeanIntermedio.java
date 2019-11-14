/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.BeanIntermedioLocal;
import com.mycompany.entity.Animal;
import com.mycompany.excepciones.ExGenerica;
import com.mycompany.excepciones.NoArroba;
import com.mycompany.excepciones.NoIguales;
import com.mycompany.interfaces.AnimalFacadeLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author Admin
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class BeanIntermedio implements BeanIntermedioLocal {

    @EJB
    AnimalFacadeLocal animalFacade;
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarNoA(Animal animal) throws ExGenerica{
        try{
            animalFacade.agregarNa(animal);
        }catch(NoArroba na){
            throw new ExGenerica(na.getMessage());
        }
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarNoI(Animal animal, int a, int b) throws ExGenerica{
        try{
            animalFacade.agregarNI(animal, a, b);
        }catch(NoIguales ni){
            throw new ExGenerica(ni.getMessage());
        }
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarDivision(Animal animal, int a, int b) throws ExGenerica{
        try{
            animalFacade.agregarDivision(animal, a, b);
        }catch(Exception ex){
            throw new ExGenerica("Imposible dividir por Cero (0)");
        }
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void agregarArchivo(Animal animal) throws ExGenerica{
        try{
            animalFacade.agregarArchivo(animal);
        }catch(Exception ex){
            throw new ExGenerica(ex.getMessage());
        }
    }
}
