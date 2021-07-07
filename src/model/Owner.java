package model;

public class Owner extends Usuario {
    private Wallet wallet;

    public Owner(String nNombre){
        super();
        wallet = new Wallet(false);
        setNombre(nNombre);
    }
}
