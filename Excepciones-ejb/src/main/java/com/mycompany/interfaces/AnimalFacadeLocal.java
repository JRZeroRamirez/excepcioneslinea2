/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.Animal;
import com.mycompany.excepciones.NoArroba;
import com.mycompany.excepciones.NoIguales;
import java.io.IOException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Admin
 */
@Local
public interface AnimalFacadeLocal {

    void agregarNa(Animal animal) throws NoArroba;
    
    void agregarNI(Animal animal, int a, int b) throws NoIguales;
    
    void agregarDivision(Animal animal, int a, int b) throws ArithmeticException;
    
    void agregarArchivo(Animal animal) throws Exception;
    
}
