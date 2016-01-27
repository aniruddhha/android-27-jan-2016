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
public class Bank implements IAtm, Purgable{

    @Override
    public void deposit(String acNo, int amt) {
    }

    @Override
    public int balance(String acNo) {
        
        return 0;
    }

    @Override
    public void withdraw(String acNo, int amt) {
    }
}