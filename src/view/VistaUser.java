package view;

import model.Owner;

public class VistaUser {
    
    public static void main(String[] args) {
        Owner owner1 = new Owner();
        Owner owner2 = new Owner();
        System.out.println(owner1.getNombre());
        System.out.println(owner2.getNombre());
    }
}
