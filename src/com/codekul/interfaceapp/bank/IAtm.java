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
public /*abstract*/ interface IAtm {
    
    /*public static final*/ int BANK_ID = 100;
    
    abstract void deposit(String acNo, int amt);
    
    int balance(String acNo);
    
    public void withdraw(String acNo, int amt);
    
}
