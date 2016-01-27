/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.interfaceapp;

import com.codekul.interfaceapp.bank.AtmMachine;
import com.codekul.interfaceapp.bank.HdfcBank;
import com.codekul.interfaceapp.bank.IAtm;
import com.codekul.interfaceapp.bank.IciciBack;
import com.codekul.interfaceapp.bank.UnionBank;
import com.codekul.interfaceapp.exception.MyException;
import com.codekul.interfaceapp.inner.Place;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aniruddha
 */
public class Main {

    public static void main(String[] args) throws Exception {

        try /*throws Exception*/ {
            
            IAtm hdfcCust = new HdfcBank();
            
            IAtm iciciCust = new IciciBack();
            
            IAtm unionCust = new UnionBank();
            
            AtmMachine atmMachine = new AtmMachine();
            
            atmMachine.swipe(hdfcCust);
            atmMachine.swipe(iciciCust);
            atmMachine.swipe(unionCust);
            
            Place place = new Place();
            Place.PublicInnerClass publicInnerClass = place.new PublicInnerClass();
            
            Place.StaticInnerClass staticInnerClass = new Place.StaticInnerClass();
            
            IAtm atmRaw = new IAtm() { // anonymus inner class

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
            };
            int i = 0;
            try {
                
                i = 10 / 0; // throw ArithmaticException();
            } catch (Exception e) {
                e.printStackTrace();
                
                i = 0;
            }
            
            System.out.println("hi here");
            
            justDoIt();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String mobileNum = "12";
        
        if(mobileNum.length() < 10) throw new MyException();
    }

    public static void justDoIt() throws Exception {

        int i = 10 / 0;
    }

}
