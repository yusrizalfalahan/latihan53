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
public class rabbit extends animal {
    private final String Color;
    private final String Name;
    
    
    public rabbit (String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.Color = color;
        this.Name = name;
       
    }

    public String getColor() {
        return Color;
    }

    public String getName() {
        return Name;
    }
    
    
}
