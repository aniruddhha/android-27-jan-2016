/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.interfaceapp.bank;

/**
 *
 * @author aniruddha
 */
public interface Accountable extends IAtm{
    
    void audit(String acNo);
}
