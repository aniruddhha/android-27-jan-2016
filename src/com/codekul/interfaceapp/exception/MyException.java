/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.interfaceapp.exception;

/**
 *
 * @author aniruddha
 */
public class MyException extends Exception{

    public MyException() {
        
    }
    
    @Override
    public String getMessage() {
        return super.getMessage() +" Invalid mobile num"; //To change body of generated methods, choose Tools | Templates.
    }
}
