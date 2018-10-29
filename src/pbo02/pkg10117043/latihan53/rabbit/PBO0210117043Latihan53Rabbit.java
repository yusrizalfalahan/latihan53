/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan53.rabbit;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * @author Acer
 */
public class PBO0210117043Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        animal Animal = new animal(true, "gress", 4);
        rabbit Rabbit = new rabbit ("Peter ", Animal.isVegetarian(), Animal.getEats(), Animal.getNoOflegs(), "grey");
        System.out.println("Hello, His name is " + Rabbit.getName());
        System.out.println(Rabbit.getName() + "is Vegetarian? " + Rabbit.isVegetarian());
        System.out.println(Rabbit.getName() + "eats " + Rabbit.getEats());
        System.out.println(Rabbit.getName() + "has " + Rabbit.getNoOflegs() + " legs");
        System.out.println(Rabbit.getName() + "color is " + Rabbit.getColor());
    }
    
}
