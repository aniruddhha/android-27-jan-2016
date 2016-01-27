/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.interfaceapp.inner;

/**
 *
 * @author aniruddha
 */
public class Place {
    
    // local 
    // inner class(private , public or static)
    // anonymus 
    
    private String name;
    
    public void getItDone(){
        
        final int i = 10;
        
        class Done {

            int j;
            public Done() {
                
                System.out.println("i" +i);
            }
            //local inner class
        }
        
        //System.out.println("J"+j); j not acceesible 
    }
    
    private class PrivateInnerClass {
        
    }
    
    public class PublicInnerClass {

        private int innerPrivate = 10;
        
        public PublicInnerClass() {
            
            name = "";
        }
        
    }
    
    public static class StaticInnerClass {
        
    }
    
    public void getInfo(){
    }
}
