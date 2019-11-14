/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.Animal;
import com.mycompany.excepciones.ExGenerica;
import javax.ejb.Local;

/**
 *
 * @author Admin
 */
@Local
public interface BeanIntermedioLocal {

    void agregarNoA(Animal animal) throws ExGenerica;

    void agregarNoI(Animal animal, int a, int b) throws ExGenerica;
    
    void agregarDivision(Animal animal, int a, int b) throws ExGenerica;
    
    void agregarArchivo(Animal animal) throws ExGenerica;
}
