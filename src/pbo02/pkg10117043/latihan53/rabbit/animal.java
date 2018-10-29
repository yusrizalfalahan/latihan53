/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan53.rabbit;

/**
 *
 * @author Acer
 */
public class animal  {
    protected boolean vegetarian;
    protected String eats;
    protected int noOflegs;
    
    public animal (boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOflegs = legs;
    }
    public boolean isVegetarian (){
     if (eats.equalsIgnoreCase("gress")) {
         vegetarian = false;
     } else {
         vegetarian = true;
     }
     return vegetarian;
     }    

   

    public String getEats() {
        return eats;
    }

    public int getNoOflegs() {
        return noOflegs;
    }
       
    }

  

