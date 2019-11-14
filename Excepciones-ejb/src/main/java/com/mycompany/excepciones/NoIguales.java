/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excepciones;

import javax.ejb.ApplicationException;

/**
 *
 * @author Admin
 */
@ApplicationException(rollback = false)
public class NoIguales extends Exception {

    public NoIguales(String str) {
        super(str);
    }
}
