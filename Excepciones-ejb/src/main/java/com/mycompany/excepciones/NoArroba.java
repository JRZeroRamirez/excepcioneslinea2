/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excepciones;

import java.io.Serializable;
import javax.ejb.ApplicationException;

/**
 *
 * @author Admin
 */
@ApplicationException(rollback = true)
public class NoArroba extends Exception {

    public NoArroba(String str) {
        super(str);
    }
}
